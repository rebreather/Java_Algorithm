class Solution {
    public String solution(int num) {
        String answer = "Even";
        if(num % 2 == 0) return answer;
        else if(num % 2 != 0) answer = "Odd";
        return answer;
    }
}