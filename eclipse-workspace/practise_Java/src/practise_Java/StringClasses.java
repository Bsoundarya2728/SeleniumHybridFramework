package practise_Java;

public class StringClasses {
	/**
	 * @param arg
	 */
	public static void main(String[] dynamic) {
		
	StringBuffer sbuf=new StringBuffer("Naresh");
	sbuf.append("Soundarya");
	System.out.println(sbuf);
	sbuf.setCharAt(1, 'S');
	System.out.println(sbuf);
	
	StringBuilder sbul=new StringBuilder("Soundarya");
	sbul.append("Naresh");
	System.out.println(sbul);
	
	String s = new String("Bejjenki");
	System.out.println(s.charAt(7));
	System.out.println(s.compareTo("Bejjenki"));
	System.out.println(s.compareToIgnoreCase("bejjenki"));
	System.out.println(s.contentEquals(("Bejjenki")));
	//System.out.println(s.copyValueOf('S',5));
	
	}
	public static void main(int[] dynamic) {
		System.out.println(("Bejjenki"));
	}
	public static void main(double[] dynamic) {
		System.out.println(("Bejjenki"));
	}
}
