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
		
		System.out.println("c1��" + c1.kind +", " + c1.number +"�̸�, ũ��� ����" + c1.width + ",���� " + c1.height + "mm �̴�.");
		System.out.println("c2��" + c2.kind +", " + c2.number +"�̸�, ũ��� ����" + c2.width + ",���� " + c2.height + "mm �̴�.");
		System.out.println("c1 �� ���� ���̸� ���� "+ c1.width +", "+ c1.width + "�� �����մϴ�.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1��" + c1.kind +", " + c1.number +"�̸�, ũ��� ����" + c1.width + ",���� " + c1.height + "mm �̴�.");
		System.out.println("c2��" + c2.kind +", " + c2.number +"�̸�, ũ��� ����" + c2.width + ",���� " + c2.height + "mm �̴�.");
	}
}

class card {
	String kind;
	int number ;
	static int width = 100;
	static int height = 250;
}