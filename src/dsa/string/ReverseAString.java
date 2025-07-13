package dsa.string;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "progrec";
		String reverse = "";
		
		for (int i = name.length()-1; i>=0; i--) {
			char res = name.charAt(i);
			reverse = reverse+""+res;
		}
		System.out.println("Reverse = "+ reverse); // cergorp
		
		StringBuilder strBuild = new StringBuilder(name);
		strBuild.reverse();
		System.out.println(strBuild); // cergorp
		
		System.out.println(strBuild.toString());  // cergorp
		
	}
}
