


// 조건에 맞게 수열 변환하기 3 - 프로그래머스

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 0) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i] + k;
            }
        } else if (k % 2 == 1) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 2;
        Solution T = new Solution();
        System.out.println(T.solution(arr, k));
    }

}
