package temp;

public class StringDemo1 {

	public static void main(String[] args) {
		
		System.out.println("hi");
		String s1="java";
		String s2=new String("java");
		String s3="java";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));

	}

}
