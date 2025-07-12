package dsa.string;

public class Palindrome {

	public static void main(String[] args) {
		String name = "121";
		String revs = "";
		
		for (int i = name.length()-1; i>=0; i--) {
			char res = name.charAt(i);
			revs = revs+""+res;
		}
		
		if(name.equals(revs)) {
			System.out.println(revs + " is a Palindrome");
		} else {
			System.out.println(revs + " is a Palindrome");
		}
	}
}
