

import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                count++;
            }
        }

        String[] answer = new String[count];

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < todo_list.length; j++) {
                if (!finished[j]) {
                    answer[i] = todo_list[j];
                    break;
                } else {
                    continue;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(todo_list, finished)));
    }
}
