

// 프로그래머스 1로 만들기

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 0;

        for (int i = 0; i < num_list.length; i++) {
            result = num_list[i];

            while (true) {
                if (result % 2 == 0) {
                    result = result / 2;
                    answer++;
                } else if (result == 1){
                    break;
                } else if (result % 2 != 0){
                    result = (result - 1) / 2;
                    answer++;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};

        Solution T = new Solution();
        System.out.println(T.solution(num_list));
    }
}
