
//��ȸ�� ����ϴ� Ŭ����
public class LookMember {

// Addmember Ŭ�������� memberAdd(�Է�����) �޾ƿ��� �ڵ�
private AddMember addMember;

private String member;

public LookMember(AddMember addMember) {
   
   this.addMember = addMember;
     
}

// getter setter
public String getMember() {
   return member;
}

public void setMember(String member) {
   this.member = member;
}

public void lookMember() {

   // �ݺ��ϸ鼭 ����� �����
   String[] memberAdd = addMember.getMemberAdd();
   for (int i = 0; i < memberAdd.length; i++) {
      // null���� �־ ��µ��� �ʰ� ��.
      member = memberAdd[i];
      if(member != null) {
         // ��ϵ� �迭�� ���
         System.out.println(member);

      }
   }
}

public void lookMember(String id, String pw) {

	   String[] memberAdd = addMember.getMemberAdd();
	
	// id, pw ��ġ�� ��ȸ���
	   if(addMember.getID(id).equals(id)&&addMember.getPW(pw).equals(pw)) {
		   for (int i = 0; i < memberAdd.length; i++) {
			  if(memberAdd[i].contains(id)&&memberAdd[i]!=null) {
				   System.out.println(memberAdd[i]);
				   break;
			  }
			   
		   }
	   }
	}

}