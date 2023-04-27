
// 프로그래머스 - 접두사인지 확인하기

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if (my_string.contains(is_prefix) && my_string.startsWith(is_prefix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}
