

// 프로그래머스 - A 강조하기

public class Solution {
    public String solution(String myString) {
        String answer = "";
        String temp = "";

        temp = myString.replace("a", "A");

        char[] ch = temp.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i]) && ch[i] != 'A') {
                answer += Character.toLowerCase(ch[i]);
            }  else {
                answer += ch[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String myString = "PrOgRaMmErS";
        Solution T = new Solution();
        System.out.println(T.solution(myString));
    }
}
