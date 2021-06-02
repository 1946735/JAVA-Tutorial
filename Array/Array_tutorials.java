package Array;

public class Array_tutorials {

	public static void main(String[] args) {
		//String[] classGroup = {"김민석", "김선욱", "송호길", "김진영"}; // 문자열 데이터
		 						//0,1,2,3, 그룹핑하는 것을 목적으로 둔다.
		
		String[] classGroup = new String[4];
		classGroup[0] = "김민석";
		System.out.println(classGroup.length);
		// length : 배열이 담을수 있는 개수 : 4 
		classGroup[1] = "김선욱";
		System.out.println(classGroup.length);
		classGroup[2] = "송호길";
		System.out.println(classGroup.length);
		classGroup[3] = "김진영";
		System.out.println(classGroup.length);													
		
	}

}
