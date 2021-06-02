package ExerciseJAVA;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#x)%n",ch, code, code);
		
		char hch = '°¡';
		System.out.printf("%c=%d(%#x)%n",hch, (int)hch, (int)hch);
		
		char ch1 = 'B';
		int code1 = (int)ch1;
		
		System.out.printf("%c = %d(%#x)%n",ch1, code1, code1);
		
		char hch1 = '³ª';
		System.out.printf("%c = %d(%#x)%n",hch1, (int)hch1, (int)hch1);
	}

}
