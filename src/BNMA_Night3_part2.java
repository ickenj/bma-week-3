
public class BNMA_Night3_part2 {
		 
	public static void main(String[] args) {

		if(args.length==0) {
			System.out.println("No arguments were passed in");
			return;
		}
		
		String action = args[0];
		String[] values = new String[0];
		
		if(args.length<2) {
			System.out.println("No arguments were passed in");
			return;
		}
		else {
			action = args[0];
			values = new String[args.length-1];
			for( int i=1; i<values.length; i++ ) {
				values[i] = args[i];
			}
		}
		
		if(action.equals("foreach")) {
			testForEach(values);
		}
		else if(action.equals("for")) {
			testFor(values);
		}
		else if(action.equals("while")) {
			testWhile(values);
		}
		else {
			System.out.println("No match found for action " + action);
		}
	}

		static void testForEach(String[] values) {
			System.out.println("Testing for-each:");
			for( String value : values ) {
				System.out.println(value);
			}
		}
		
		static void testFor(String[] values) {
			System.out.println("Testing for:");
			for( int i=0; i < values.length; i++ ) {
				System.out.println(values[i]);
			}
		}

		static void testWhile(String[] values) {
			System.out.println("Testing while:");
			int i = 0;
			while( i < values.length ) {
				System.out.println(values[i]);
				i++;
			}
		}
}

