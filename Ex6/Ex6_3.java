package Ex6;

class Ex6_3 {
	public static void main(String args[]) {
		
		System.out.println("Card.width = "+ card.width);
		System.out.println("Card.height = "+ card.height);
		
		card c1 = new card();
		c1.kind = "Heart";
		c1.number = 7;
		
		card c2 = new card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind +", " + c1.number +"이며, 크기는 가로" + c1.width + ",세로 " + c1.height + "mm 이다.");
		System.out.println("c2은" + c2.kind +", " + c2.number +"이며, 크기는 가로" + c2.width + ",세로 " + c2.height + "mm 이다.");
		System.out.println("c1 의 폭과 높이를 각각 "+ c1.width +", "+ c1.width + "로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은" + c1.kind +", " + c1.number +"이며, 크기는 가로" + c1.width + ",세로 " + c1.height + "mm 이다.");
		System.out.println("c2은" + c2.kind +", " + c2.number +"이며, 크기는 가로" + c2.width + ",세로 " + c2.height + "mm 이다.");
	}
}

class card {
	String kind;
	int number ;
	static int width = 100;
	static int height = 250;
}