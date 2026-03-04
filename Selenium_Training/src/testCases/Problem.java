package testCases;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love programming very much";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
		    if (i % 2 == 0) { // Position 1, 3, 5... (0-indexed 0,2,4)
		        words[i] = new StringBuilder(words[i]).reverse().toString();
		    }
		}
		System.out.println(String.join(" ", words));
		
		String s1 = "I love programming very much";
		String[] words1 = s1.split(" ");
		for (int i =0; i<words1.length; i++) {
			if(i%2!=0) {
				words1[i] = new StringBuilder(words1[i]).reverse().toString();
			}
			
		}
		System.out.println(String.join(" ", words1));
	}

}
