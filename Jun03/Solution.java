// 배열 만들기 5 - 프로그래머스

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] answer = new int[intStrs.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if (answer[i] > k) {
                list.add(answer[i]);
            } else {
                continue;
            }
        }
        
        return list;
    }
}
