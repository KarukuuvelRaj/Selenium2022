<<<<<<< HEAD
package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String inp="CognizantCgg";
		char op='g';
		int count = 0;
		char[] charArray = inp.toCharArray();
		for (int i=0;i<charArray.length;i++) {
			if(charArray[i] == op) {
				count++;
			}
		}
		System.out.println("The character count is: "+count);
	}
}
=======
package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String inp="CognizantCgg";
		char op='g';
		int count = 0;
		char[] charArray = inp.toCharArray();
		for (int i=0;i<charArray.length;i++) {
			if(charArray[i] == op) {
				count++;
			}
		}
		System.out.println("The character count is: "+count);
	}
}
>>>>>>> e621e9f965e68abdd61288c382776486f548a122
