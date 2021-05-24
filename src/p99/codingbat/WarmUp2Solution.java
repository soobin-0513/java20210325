package p99.codingbat;

public class WarmUp2Solution {
	public int stringMatch(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int loop = Math.min(aLen, bLen);
		int cnt = 0;

		for (int i = 0; i < loop - 1; i++) {
			String aSub = a.substring(i, i + 2);
			String bSub = b.substring(i, i + 2);

			if (aSub.equals(bSub)) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean array123(int[] nums) {

		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == 2) {
				if (nums[i - 1] == 1 && nums[i + 1] == 3) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean arrayFront9(int[] nums) {
		int len = nums.length;
		int loop = Math.min(len, 4);

		for (int i = 0; i < loop; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}

		return false;
	}

	public int arrayCount9(int[] nums) {
		int cnt = 0;

		for (int num : nums) {
			if (num == 9) {
				cnt++;
			}
		}

		return cnt;
	}

	public int last2(String str) {
		int len = str.length();

		if (len < 2) {
			return 0;
		}

		String last = str.substring(len - 2);

		int count = 0;

		for (int i = 0; i < len - 2; i++) {
			String mid = str.substring(i, i + 2);
			if (mid.equals(last)) {
				count++;
			}
		}

		return count;
	}

	public String stringSplosion(String str) {

		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res += str.substring(0, i + 1);
		}

		return res;
	}

	public String stringBits(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i += 2) {
			res += str.charAt(i);
		}
		return res;
	}

	boolean doubleX(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			if (c == 'x') {
				return str.charAt(i + 1) == 'x';
			}
		}

		return false;
	}

	int countXX(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}

		return cnt;
	}

	public String frontTimes(String str, int n) {
		String res = "";

		String front = str;

		if (str.length() >= 3) {
			front = str.substring(0, 3);
		}

		for (int i = 0; i < n; i++) {
			res += front;
		}

		return res;
	}

	public String stringTimes(String str, int n) {
		String res = "";

		for (int i = 0; i < n; i++) {
			res += str;
		}

		return res;
	}
}

