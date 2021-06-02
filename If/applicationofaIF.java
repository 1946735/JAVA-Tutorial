package If;

public class applicationofaIF {
 // public class loginDemo
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("1946735")) {
			if(password.equals("111111")) {
			System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 - 비밀번호를 확인하세요");
			
			}
		} else {System.out.println("로그인 실패 - 아이디를 확인하세요");

	}

}
}