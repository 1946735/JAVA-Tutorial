package conditaionaloperator;

public class or_tutorials {

	public static void main (String[] args) {
		String id = args[0];
		String password = args[1];
		if ((id.equals("1946735")||id.equals("k1946735")||id.equals("kim1946735"))
				&& password.equals("111111")) {
				System.out.println("right");
	}else {
		System.out.println("wrong");
	}
}
}