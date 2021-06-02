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
	} // main ��
}

class FlowEx24 {
	public static void main(String[] args) {
		int i = 11 ;
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
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
		 System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		 Scanner scanner = new Scanner (System.in);
		 String tmp = scanner.nextLine();
		 num = Integer.parseInt(tmp);
		 
		 while(num!=0) {
			 sum +=num%10; // sum = sum + num %10;
			 System.out.printf("sum=%3d num=%d%n",  sum,num);
			 
			 num /=10 ; // num = num / 10; num�� 10���� ���� ���� �ٽ� num�� ����
		 }
		 System.out.println("�� �ڸ����� �� : " + sum);
	 }
}

class FlowEX26 {
	public static void main (String [] args) {
		
		int sum = 0 ;
		int i = 0 ;
		// i �� 1�� �������Ѽ� sum�� ��� ���س�����.
		while ((sum += ++i) <=100) { // ������ 2���� '+' �� ������ ���� Ŀ�� '+'�� ������ i=0�� ��
			System.out.printf("%d - %d %n",i , sum);
		}
	}
}

class FlowEX27 {
	public static void main (String[] args) {
		int num ;
		int sum = 0 ;
		boolean flag = true ;  // while ���� ���ǽ����� ��� �� ����
		
		Scanner scanner = new Scanner (System.in);
				
				System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
		while (flag) { // flag�� ���� true �̹Ƿ� ���ǽ��� ���� �ȴ�. 
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num ;  // num�� 0�� �ƴϸ� sum�� ���Ѵ�.
			} else { 
				 flag = false ; // num�� 0�̸�, flag�� ���� flase�� ����.
				 
			}
		} // while ���� ��.
		
		System.out.println("�հ� : " + sum);
		System.out.printf( "ȭ���� x %d �������� �� �ѰŴ�.",sum );
	}
}

class FlowEX28 {
	public static void main (String [] args) {
		System.out.println("2.3 do-while �� ���� page 173");	
		 
		int input = 0, answer = 0;
		
		answer = (int) (Math.random() * 100) + 1 ; // 1~100������ ������ ���� ����.
		Scanner scanner = new Scanner (System.in);
		
		do {
		System.out.print("1�� 100������ ������ �Է��ϼ���.>");
		input = scanner.nextInt();
		
		if(input > answer) {
			System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
		}else if (input < answer) {
			System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}
		while(input!=answer);
		System.out.println("�����Դϴ�.!");
		
	}
}

class FlowEx29 {
	
	 public static void main (String[] args) {
		 System.out.println("2.3 do-while �� ����29 page 174");
		  for (int i = 1 ; i<=100 ; i++) {
			  System.out.printf("i=%d ", i);
			  
			  int tmp = i;
			  		  
			  do {
				  // tmp%10�� 3�� ������� Ȯ�� (0����)
				  if(tmp%10%3==0 && tmp%10!=0) 
	// tmp �� 10���� �켱 ������ �� �������� 3���� ���� �� 0�϶� �׸��� tmp�� 10���� ������ �� �������� 0�� �ƴҶ� "¦"
					  System.out.print("¦");
				  // tmp /= 10 �� tmp = tmp / 10�� ����
			  } while ((tmp/=10)!=0);
			  
			  System.out.println();
		  }
	 }// main
}

class FlowEx30 {
	
	public static void main (String[] args) {
		System.out.println("2.4 break�� ����30 page 175");
		int sum = 0;
		int i   = 0;
		
		while (true) { 
			if (sum > 1034)
				break ; // if ���� ���϶����� �극��ũ �Ĵ��� �ݺ����� �����ϴٰ� if ���� ���̸� ���߰� ������. while�� ������.
			++i ;
			sum += i ;
		} // end of while
		 
		System.out.println("i+" +i);
		System.out.println("sum="+sum);
	}
}
class FlowEx31 {
	
	public static void main (String[] args) {
		System.out.println("2.5 continue�� ����31 page 176");
			for(int i=0;i <=10; i++) {
				if (i%3==0)
					continue;
				System.out.println(i);	
			}		
	}
}

class FlowEx32 {
	
	public static void main (String[] args) {
		System.out.println("2.5 continue�� ����32 page 177");
int menu = 0;
int num = 0;

Scanner scanner = new Scanner(System.in);
while (true) {
	System.out.println("(1) Square");
	System.out.println("(2) Square root");
	System.out.println("(3) log");
	System.out.print("���ϴ� Menu(1~3)�� �����ϼ���.(����=0)>");
	
	String tmp = scanner.nextLine();
	menu = Integer.parseInt(tmp);
	
	if(menu==0) {
		System.out.println("���α׷��� �����մϴ�.");
		break;
		
	}else if(!(1<=menu && menu <=3)) {
		System.out.println("Menu�� �߸� �����ϼ̽��ϴ�.(����=0)");
		continue;
	}
	
	System.out.println("�����Ͻ� Menu��" + menu +"���Դϴ�.");
		}	
	}
}

class FlowEx33 {
	
	public static void main (String[] args) {
		System.out.println("2.6 �̸����� �ݺ��� ����33 page 178");
		//for ���� Loop1�̶�� �̸��� �ٿ���.
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
		System.out.println("2.6 �̸����� �ݺ��� ����34 page 179");
		int menu = 0, num = 0;

Scanner scanner = new Scanner(System.in);

outer :
while (true) {
	System.out.println("(1) Square");
	System.out.println("(2) Square root");
	System.out.println("(3) log");
	System.out.print("���ϴ� Menu(1~3)�� �����ϼ���.(����=0)>");
	
	String tmp = scanner.nextLine();
	menu = Integer.parseInt(tmp);
	
	if(menu==0) {
		System.out.println("���α׷��� �����մϴ�.");
		break;
		
	}else if(!(1<=menu && menu <=3)) {
		System.out.println("Menu�� �߸� �����ϼ̽��ϴ�.(����=0)");
		continue;
	}
	
	for (;;) {
		
		System.out.print("����� ���� �Է��ϼ���.(������� :0, ��ü���� :99)>");
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
	







