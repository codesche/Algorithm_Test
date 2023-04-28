

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(10));
    }
}
