<<<<<<< HEAD
package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> obj = new LinkedHashSet<String>();
		for (String newChar : split) {
			obj.add(newChar);
		}
		/*
		 * String out=""; for (String str : obj) { out=out+str; }
		 */
		System.out.println(obj);
	}
=======
package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> obj = new LinkedHashSet<String>();
		for (String newChar : split) {
			obj.add(newChar);
		}
		/*
		 * String out=""; for (String str : obj) { out=out+str; }
		 */
		System.out.println(obj);
	}
>>>>>>> e621e9f965e68abdd61288c382776486f548a122
}