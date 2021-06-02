package CompareBoolean;

public class CompareDemo {

	public static void main(String[] args) {
		System.out.println(1==2); // false
		System.out.println(1==1); // ture
		System.out.println("one"=="two"); // false
		System.out.println("one"=="one"); // true
		
		System.out.println("!=");
		System.out.println(1!=2); //true
		System.out.println(1!=1); //false
		
		System.out.println("ºÎµîÈ£");
		System.out.println(10>=20); // false
		System.out.println(10>=2);
		
		System.out.println(".equals");
		String a = "Hello World";
		String b = new String ("Hello World");
		System.out.println(a==b);
		 // false 
		System.out.println(a.equals(b)); // true
				
	}

}
