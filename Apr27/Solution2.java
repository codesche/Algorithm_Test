
// 프로그래머스 - ad 제거하기

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        answer = Arrays.stream(strArr)
                    .filter(item -> !item.contains("ad"))
                    .toArray(String[]::new);
        
        return answer;
    }
}
