package exercises2;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		String s = "  Hello, how   are you    doing  today?";
		
		s = s.replaceAll(" ","");
		System.out.println(s);
	}
}
