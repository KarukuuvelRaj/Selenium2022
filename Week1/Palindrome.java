<<<<<<< HEAD
package week1.day2;
public class Palindrome {
	public static void main(String[] args) {
		String val="Malayalam";
		String newVal="";
		for (int i=val.length()-1;i>=0;i--) {
			newVal=newVal+val.charAt(i);
		}if(newVal.equalsIgnoreCase(val)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
=======
package week1.day2;
public class Palindrome {
	public static void main(String[] args) {
		String val="Malayalam";
		String newVal="";
		for (int i=val.length()-1;i>=0;i--) {
			newVal=newVal+val.charAt(i);
		}if(newVal.equalsIgnoreCase(val)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
>>>>>>> e621e9f965e68abdd61288c382776486f548a122
}