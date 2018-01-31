package sc;

public class StringClassDemo {

	
	public static void main(String[] args) {
		String b="abc";
		String c="this,is,a,fan";
		String up= b.toUpperCase();
		System.out.println(up);
		System.out.println(b.toLowerCase());
		System.out.println(b.contains("ab"));
		System.out.println(b.concat("cde"));
		String[] s = c.split(",");
		System.out.println(s[0]);

	}

}
