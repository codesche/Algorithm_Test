

// 프로그래머스 - 가까운 1 찾기

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[idx] != 1 && i > idx && arr[i] == 1) {
                answer = i;
                break;
            } else if (i == idx && arr[i] == 1)  {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}
