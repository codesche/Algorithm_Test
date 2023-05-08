
// 프로그래머스 - 빈 배열에 추가, 삭제 (메모리 초과)

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                int tempSize = list.size();
                for (int k = list.size() - 1; k > list.size() - arr[i] - 1; k--) {
                    if (k == tempSize - arr[i] - 1) {
                        break;
                    }
                    list.remove(list.get(k));
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        Solution T = new Solution();
        System.out.println(T.solution(arr, flag));
    }

}
