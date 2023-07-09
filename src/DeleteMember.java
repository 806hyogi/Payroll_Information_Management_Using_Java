
import java.util.Scanner;

//삭제 클래스
public class DeleteMember {

	private AddMember add;
	private String[] allMember;
	private int arrCnt;

//생성자
	public DeleteMember(AddMember addMember) {
		add = addMember;
		arrCnt = 0;
		allMember = add.getMemberAdd();
	}

	Scanner sc = new Scanner(System.in);

	public void deleteMember() {

		System.out.println("삭제하고 싶은 이름을 입력하세요");
		String inputDelete = sc.nextLine();

//		for (int i = 0; i < allMember.length; i++) {
//			if (arrCnt < allMember.length - 2)
//				arrCnt++;
//
//			if (allMember[i] != null && allMember[i].contains(inputDelete)) { // 지울 이름이 있을 경우
//				if (allMember[0] != null && allMember[0].contains(inputDelete)) {// 첫번째 인덱스일 경우
//					if (allMember[i] != null) {
//						for (int j = 0; j < allMember.length - 1; j++) {
//							arrCnt = 0;
//							if (arrCnt < allMember.length - 2)
//								arrCnt++;
//							allMember[i] = allMember[i + arrCnt];
//							if (j == allMember.length - 2)
//								break;
//						}
//					}
//				} else {// 첫번째, 마지막 인덱스가 아닐 경우
//					System.out.println("영역1");
//					
//					for (int j = 2; j < allMember.length; j++) {
//						System.out.println("영역2");
//						System.out.println(arrCnt);
//						allMember[j] = allMember[j + arrCnt];
//
//						if(allMember[j]==null) {
//							System.out.println("Test: "+allMember[j-1]);
//							allMember[j-1] = "x";
//							break;
//						}
//						if (j == allMember.length)
//							break;
//					}
//				}
//			}
//			
//		}
		
		int a = allMember.length;
		int index = -1;
		
		for(int i =0; i<a; i++) {
			if(allMember[i].contains(inputDelete)) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			for(int k = index; k<a -1; k++) {
				allMember[k] = allMember[k +1];
			}
			allMember[a-1] = "";
			a--;
		}
	}
}