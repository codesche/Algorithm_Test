
// 프로그래머스-문자 개수 세기

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer[(int) my_string.charAt(i) - 65]++;
            } else {
                answer[(int) my_string.charAt(i) - 71]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "Programmers";

        Solution T = new Solution();

        System.out.println(Arrays.toString(T.solution(str)));
    }
}
