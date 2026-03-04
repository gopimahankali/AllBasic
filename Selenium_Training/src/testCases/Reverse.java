package testCases;

public class Reverse {
	public static String reverse(String str) {
		if(str==null || str.length()<=1) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(reverse("my name is gopi"));
		String s= "My Name is Gopi";
		StringBuilder rev = new StringBuilder(s);
		rev.reverse();
		System.out.println(rev);
		String a = "Hello";
		String b = "World";

		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());

		System.out.println(a);
		System.out.println(b);
		String str = "a2b3c15";
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (Character.isDigit(ch)) {
		        temp += ch;
		    } else {
		        sum += Integer.parseInt(temp);
		        temp = "0";
		    }
		}
		sum += Integer.parseInt(temp);
		System.out.println(sum);
	}

}
