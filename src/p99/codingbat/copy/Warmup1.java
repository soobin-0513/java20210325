package p99.codingbat.copy;

public class Warmup1 {
	public String frontBack(String str) {
		  
		  if(str.length()<=1){
		    return str;
		  }else{
		  char last =str.charAt(str.length()-1);
		  char first = str.charAt(0);
		    return  last+ str.substring(1, str.length()-1) +  first;
		  }
		}
	
	public String frontBack1(String str) {
		if (str.length() > 1) {
			char front = str.charAt(0);
			char last = str.charAt(str.length() - 1);

			String mid = str.substring(1, str.length() - 1);

			return last + mid + front;
		}

		return str;

	}

	public String missingChar(String str, int n) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (i != n) {
				res += str.charAt(i);
			}
		}

		return res;
	}

	public String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}

		/*
		 * if (str.length() < 3) { return "not " + str; }
		 * 
		 * String front = str.substring(0, 3);
		 * 
		 * if (front.equals("not")) { return str; } else { return "not " + str; }
		 */
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0) && (b < 0);
		} else {
			return (a * b) < 0;
		}
	}

	public boolean nearHundred(int n) {
		int diff = n - 100;

		if (diff >= -10 && diff <= 10) {
			return true;
		}

		diff = n - 200;

		if (diff >= -10 && diff <= 10) {
			return true;
		}

		return false;
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10) {
			return true;
		}

		if (a + b == 10) {
			return true;
		}

		return false;

	}

	public boolean parrotTrouble(boolean talking, int hour) {

		if (talking) {
			if (hour < 7 || hour > 20) {
				return true;
			}
		}
		return false;
	}

	public int diff21(int n) {
		if (n < 22) {
			return 21 - n;
		} else {
			return (n - 21) * 2;
		}
	}

	public int sumDouble(int a, int b) {
		return (a == b) ? (a + b) * 2 : (a + b);
	}

	public boolean in1020(int a, int b) {
		// return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);

		if (a >= 10 && a <= 20) {
			return true;
		}

		if (b >= 10 && b <= 20) {
			return true;
		}

		return false;
	}

	public boolean icyHot(int temp1, int temp2) {

		if (temp1 < 0 && temp2 > 100) {
			return true;
		}

		if (temp1 > 100 && temp2 < 0) {
			return true;
		}

		return false;
		/*
		 * return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
		 */
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public String backAround(String str) {
		String res = "";
		int len = str.length();
		String last = str.substring(len - 1, len);

		res = last + str + last;

		return res;
	}

}
	