package If;

public class elseif {

	public static void main(String[] args) {
		// if(ture or false){참일 때 하는 행위} else{거짓일 때 하는 행위}
		
		if (false) { 
			System.out.println("a");
		} else if(false) {
			System.out.println("b");
		} else if(false){
			System.out.println("b-a");
		} else { // 생략 가능하다
			System.out.println("b-b");
		}	
	}	

} 