package conditaionaloperator;

public class and {

	public static void main(String[] args) {
		Object id = null;
		Object password = null;
		if (id.equals("1946735")&&password.equals("111111")) {
			System.out.println(1);
		}
		if (true && false) {
			System.out.println(2);
		}
		if (false && true) {
			System.out.println(3);
		}
		if (false && false) {
			System.out.println(4);
		}
	}

}
