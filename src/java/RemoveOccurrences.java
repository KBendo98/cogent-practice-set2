package exercises2;

public class RemoveOccurrences {

	public static void main(String[] args) {
		String s = "engineering";
		char removable = 'n';
		
		s = s.replaceAll(removable+"", "");
		System.out.println(s);
	}

}
