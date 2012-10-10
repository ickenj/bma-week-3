
public class BNMA_Night3_part2 {
		 
	public static void main(String[] args) {
		
		String action;
		String[] values = new String [0]
		if(args.length==0) {
			System.out.println("No arguments were passed in");
			return;
		}
		if(args.length<2) {
			System.out.println("No arguments were passed in");
			return;
		}
		else
			action = args[0];
		
		String[]values = new String[args.length-1];
		
		for(int i=1; i<values.length; i++)
			values[i] = args[i];
		
		if(action == "foreach")
			testForEach(values);
		else if(action == "for") 
			testFor(values);
		else if(action == "while") 
			testWhile(values);
		else 
			System.out.println("no match found for action " + action);
		
		
	}

	static void testForEach(String[] values) {
		
		System.out.println("Testing " + parms);
		for(int i=0; i<parms.length; i++)
			if (parms[i] == "for-each") {
				System.out.println("Testing foreach");
			} else if (parms[i] == "for") {
				System.out.println("match: for");
			} else if (parms[i] == "while") {
				System.out.println("match: while");
			}
	}
		
	static void testFor(String[] values) {
		System.out.println("Testing " + parms);
		for(int i=0; i<parms.length; i++)
			if (parms[i] == "for-each") {
				System.out.println("match: foreach");
			} else if (parms[i] == "for") {
				System.out.println("match: for");
			} else if (parms[i] == "while") {
				System.out.println("match: while");
			}
		for (String value: values) {
			System.out.println(value);
		}
	}
	
	static void testWhile(String[] parms) {
		System.out.println("Testing " + parms);
		for(int i=0; i<parms.length; i++)
			if (parms[i] == "for-each") {
				System.out.println("match: for-each");
			} else if (parms[i] == "for") {
				System.out.println("match: for");
			} else if (parms[i] == "while") {
				System.out.println("match: while");
	while(i < values.lenght) {
		System
	}
			}
	}
}
