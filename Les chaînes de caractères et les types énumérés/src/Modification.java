public class Modification {

	public static void main(String[] args) {
		
		// remplacement de caracteres
		String ch = "bonjour";
		String ch1 = ch.replace('o', 'a');
		System.out.println(ch + " -> " + ch1);
		
		
		// extraction de sous-chaine
		ch = "anticonstitutionnellement";
		ch1 = ch.substring(6);
		System.out.println(ch + " -> " + ch1);
		ch1 = ch.substring(4, 16);
		System.out.println(ch + " -> " + ch1);
		
		// passage en majuscules ou en minuscules
		ch = "LanGaGE";
		System.out.println(ch + " -> " + ch.toLowerCase());
		System.out.println(ch + " -> " + ch.toUpperCase());
		
		// suppression des séparateurs de début et de fin
		ch = "   \n\tdes separateurs avant, pendant\t\net apres \n\t    ";
		ch1 = ch.trim();
		System.out.println(ch + " -> \n" + ch1);
		
	}

}
