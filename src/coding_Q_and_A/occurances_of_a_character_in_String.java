package coding_Q_and_A;

public class occurances_of_a_character_in_String {

	public static void main(String[] args) {
		String s="hanamant";
		String replace=s.replace("a", "");
		int total=s.length();
		int repTotal=replace.length();
		int value=total-repTotal;
		System.out.println("occurances of char_a: "+value);
		

	}

}
