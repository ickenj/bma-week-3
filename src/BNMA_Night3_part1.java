
public class BNMA_Night3_part1 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		String action;
		if(args.length==0) {
			System.out.println("No arguments were passed in");
			return;
		}
		else
			action = args[0];

		if(action.equals ("for-each")) 
			System.out.println("match: " + action);
		else if(action.equals ("for"))
			System.out.println("match: " + action);
		else if(action.equals("while"))
			System.out.println("match: " + action);
		else
			System.out.println("no match found for action " + action);
	}

}
