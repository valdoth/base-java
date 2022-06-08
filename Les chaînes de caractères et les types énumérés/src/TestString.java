
public class TestString {

	public static void main(String[] args) {
		
		String ch = "bonjour";
		System.out.println(ch);
		System.out.println(ch.length());
		System.out.println(ch.charAt(2) + " " + ch.charAt(0));
		
		String ch1 = "Le langage";
		String ch2 = " Java ";
		ch = ch1 + ch2;
		System.out.println(ch);
		System.out.println("Actuellement, j'apprend " + ch + "et cette partie concerne les chaines de caracteres.");
		
		System.out.println("test1".compareTo("test2"));
		System.out.println("test2".compareTo("test1"));
		System.out.println("test1".compareTo("test1"));
		
	}

}
