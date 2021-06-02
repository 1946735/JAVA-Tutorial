package ExerciseJAVA;
import java.util.*;
public class ExWhile {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.println(i);
		i++;}
		
		for (int j = 1; j<=10; j++) {
			System.out.println(j);
		}
	}

}
class FlowEX23 {
	public static void main(String[] args) {
		int i = 5 ;
		while(i--!=0) {
			System.out.println( i + " - I Can do it. Impossible is nothing.");
		}
	} // main 끝
}

class FlowEx24 {
	public static void main(String[] args) {
		int i = 11 ;
		System.out.println("카운트 다운을 시작합니다.");
		while (i--!=0) {
			System.out.println(i);
			for(int j=0 ; j<10;j++) {
				;
			}
		}
	System.out.println("GAME OVER");
	}
}

class FlowEX25 {
	 public static void main(String[] args) {
		 int num = 0, sum = 0 ;
		 System.out.print("숫자를 입력하세요.(예:12345)>");
		 Scanner scanner = new Scanner (System.in);
		 String tmp = scanner.nextLine();
		 num = Integer.parseInt(tmp);
		 
		 while(num!=0) {
			 sum +=num%10; // sum = sum + num %10;
			 System.out.printf("sum=%3d num=%d%n",  sum,num);
			 
			 num /=10 ; // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
		 }
		 System.out.println("각 자리수의 합 : " + sum);
	 }
}

class FlowEX26 {
	public static void main (String [] args) {
		
		int sum = 0 ;
		int i = 0 ;
		// i 를 1씩 증가시켜서 sum에 계속 더해나간다.
		while ((sum += ++i) <=100) { // 조건이 2개다 '+' 만 있으면 같이 커짐 '+'만 있으면 i=0이 됨
			System.out.printf("%d - %d %n",i , sum);
		}
	}
}

class FlowEX27 {
	public static void main (String[] args) {
		int num ;
		int sum = 0 ;
		boolean flag = true ;  // while 문의 조건식으로 사용 될 변수
		
		Scanner scanner = new Scanner (System.in);
				
				System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		while (flag) { // flag의 값이 true 이므로 조건식은 참이 된다. 
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num ;  // num이 0이 아니면 sum에 더한다.
			} else { 
				 flag = false ; // num이 0이면, flag의 값을 flase로 변경.
				 
			}
		} // while 문의 끝.
		
		System.out.println("합계 : " + sum);
		System.out.printf( "화이팅 x %d 이정도면 잘 한거다.",sum );
	}
}

class FlowEX28 {
	public static void main (String [] args) {
		System.out.println("2.3 do-while 문 예제 page 173");	
		 
		int input = 0, answer = 0;
		
		answer = (int) (Math.random() * 100) + 1 ; // 1~100사이의 임의의 수를 저장.
		Scanner scanner = new Scanner (System.in);
		
		do {
		System.out.print("1과 100사이의 정수를 입력하세요.>");
		input = scanner.nextInt();
		
		if(input > answer) {
			System.out.println("더 작은 수로 다시 시도해보세요.");
		}else if (input < answer) {
			System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}
		while(input!=answer);
		System.out.println("정답입니다.!");
		
	}
}

class FlowEx29 {
	
	 public static void main (String[] args) {
		 System.out.println("2.3 do-while 문 예제29 page 174");
		  for (int i = 1 ; i<=100 ; i++) {
			  System.out.printf("i=%d ", i);
			  
			  int tmp = i;
			  		  
			  do {
				  // tmp%10이 3의 배수인지 확인 (0제외)
				  if(tmp%10%3==0 && tmp%10!=0) 
	// tmp 가 10으로 우선 나누고 그 나머지를 3으로 나눈 뒤 0일때 그리고 tmp를 10으로 나누어 그 나머지가 0이 아닐때 "짝"
					  System.out.print("짝");
				  // tmp /= 10 은 tmp = tmp / 10과 동일
			  } while ((tmp/=10)!=0);
			  
			  System.out.println();
		  }
	 }// main
}

class FlowEx30 {
	
	public static void main (String[] args) {
		System.out.println("2.4 break문 예제30 page 175");
		int sum = 0;
		int i   = 0;
		
		while (true) { 
			if (sum > 1034)
				break ; // if 문이 참일때까지 브레이크 후단의 반복문을 실행하다가 if 문이 참이면 멈추고 끝낸다. while을 끝낸다.
			++i ;
			sum += i ;
		} // end of while
		 
		System.out.println("i+" +i);
		System.out.println("sum="+sum);
	}
}
class FlowEx31 {
	
	public static void main (String[] args) {
		System.out.println("2.5 continue문 예제31 page 176");
			for(int i=0;i <=10; i++) {
				if (i%3==0)
					continue;
				System.out.println(i);	
			}		
	}
}

class FlowEx32 {
	
	public static void main (String[] args) {
		System.out.println("2.5 continue문 예제32 page 177");
int menu = 0;
int num = 0;

Scanner scanner = new Scanner(System.in);
while (true) {
	System.out.println("(1) Square");
	System.out.println("(2) Square root");
	System.out.println("(3) log");
	System.out.print("원하는 Menu(1~3)를 선택하세요.(종료=0)>");
	
	String tmp = scanner.nextLine();
	menu = Integer.parseInt(tmp);
	
	if(menu==0) {
		System.out.println("프로그램을 종료합니다.");
		break;
		
	}else if(!(1<=menu && menu <=3)) {
		System.out.println("Menu를 잘못 선택하셨습니다.(종료=0)");
		continue;
	}
	
	System.out.println("선택하신 Menu는" + menu +"번입니다.");
		}	
	}
}

class FlowEx33 {
	
	public static void main (String[] args) {
		System.out.println("2.6 이름붙은 반복문 예제33 page 178");
		//for 문에 Loop1이라는 이름을 붙였다.
		Loop1 : for (int i=2; i<=9; i++) {
				for (int j=1; j<=9; j++) {
				if  (j==5)
					break Loop1;
//					break;
//					continue Loop1;
//				continue;
					System.out.println(i+"*"+j+"="+i*j);
			} // end of for i
				System.out.println();
		}// end of Loop1
		
	}
}

class FlowEx34 {
	
	public static void main (String[] args) {
		System.out.println("2.6 이름붙은 반복문 예제34 page 179");
		int menu = 0, num = 0;

Scanner scanner = new Scanner(System.in);

outer :
while (true) {
	System.out.println("(1) Square");
	System.out.println("(2) Square root");
	System.out.println("(3) log");
	System.out.print("원하는 Menu(1~3)를 선택하세요.(종료=0)>");
	
	String tmp = scanner.nextLine();
	menu = Integer.parseInt(tmp);
	
	if(menu==0) {
		System.out.println("프로그램을 종료합니다.");
		break;
		
	}else if(!(1<=menu && menu <=3)) {
		System.out.println("Menu를 잘못 선택하셨습니다.(종료=0)");
		continue;
	}
	
	for (;;) {
		
		System.out.print("계산할 값을 입력하세요.(계산종료 :0, 전체종료 :99)>");
		tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		if (num==0)
			break; 
		
		if (num==99)
			break outer;
		
		switch (menu) {
		case 1 : System.out.println("result=" +num*num);
		break;
		case 2 : System.out.println("result=" +Math.sqrt(num));
		break;
		case 3 : System.out.println("result=" +Math.log(num));
		break;
		
				}
			}
		}	
	}
}
	







