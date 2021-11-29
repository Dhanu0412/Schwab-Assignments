/*
 * 1.	Write a class named Reassemble that accepts a list of input strings 
 * representing fragments of a word. The job of your class is to put the 
 * fragments back together to recreate the original word, which must 
 * then be printed out. 
 * 
 * You can assume that the last character of every fragment matches the 
 * first character of exactly one other fragment (the fragment from the 
 * very beginning of the word and the fragment from the very end are the 
 * only ones that don’t following this rule). 
 *  
 * Using these “join” characters (underlined in the examples below), your 
 * program can know which fragments are meant to be joined together. 
 * In the example below, notice that the “m” in the “mput” fragment 
 * matches the “m” in “Com”, allowing these fragments to be merged 
 * together into the bigger fragment “Comput”. The “t” in this new fragment 
 * then matches the first character of the “ter” fragment, finally give us the 
 * original word, “Computer”: 
 *                                                               
 * $ java Reassemble mput Com ter 
 * Computer 
 *  
 * Here is a lengthier example: 
 *                                                                  
 * $ java Reassemble wab lesSchw ion TheCharl bCorpor rati 
 * TheCharlesSchwabCorporation 
 */
public class Reassemble {

	public static String reassemble(String fragments[], String word, int i) {
		for (int j = 0; j < fragments.length; j++) {
			char last = fragments[i].charAt(fragments[i].length() - 1);
			char first = fragments[j].charAt(0);
			if (last == first) {
				word = fragments[i].concat(fragments[j].substring(1, fragments[j].length()));
				fragments[i] = word;
			}
		}
		return word;
	}

	public static void main(String[] args) {
//		String fragments[] = { "nus", "Dhan", "shy", "ya" };
		String fragments[] = { "wab", "lesSchw", "ion", "TheCharl", "bCorpor", "rati" };
//		String fragments[] = { "mput", "Com", "ter" };
//		String fragments[] = { "tmas", "ist", "Chri" };
		String word = null;
		if (fragments.length < 4) {
			for (int i = 0; i <= fragments.length - 1; i++) {
				word = reassemble(fragments, word, i);
			}
		} else {
			for (int i = 0; i < fragments.length - 2; i++) {
				word = reassemble(fragments, word, i);
			}
		}
		System.out.println("The word is " + word);
	}

}
