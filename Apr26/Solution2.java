



class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int left = 0;
        int right = str1.length();
        String temp = "";

        while (left < right) {
            if (right == str2.length()) {
                answer = 0;
                break;
            }

            temp = str2.substring(left, right);

            if (str1.equals(temp)) {
                answer = 1;
                break;
            } else {
                left++;
                right++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();

        String str1 = "abc";
        String str2 = "aabcc";

        System.out.println(T.solution(str1, str2));
    }
}
