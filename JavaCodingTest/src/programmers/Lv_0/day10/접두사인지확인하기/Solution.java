package programmers.Lv_0.day10.접두사인지확인하기;

class Solution {
	public int solution(String my_string, String is_prefix) {
		int answer = 0;

		answer = my_string.startsWith(is_prefix) ? 1 : 0;

		return answer;
	}
}