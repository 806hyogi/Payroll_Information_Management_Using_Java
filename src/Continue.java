import java.util.Scanner;
public class Continue {
	Boolean control;
	String input;
	String end;
	
	public Continue() {
		control = true; //�ʱⰪ
		end = "0";	
		//�ٽ� compare();
	}
	
	
	
	public Boolean getControl() {
		return control;
	}
	public void setControl(Boolean control) {
		this.control = control;
	}

	public void asking() {
		System.out.println("����Ͻ÷��� �ƹ��ų� �����ð� \n ���� �Ͻ÷��� 0���� �����ּ���.");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		compare();
	}
	
	//���Ͽ� ����� �������ִ� �޼ҵ�
	public void compare() {
		if(input.equals(end)) {
			control = false;
			System.exit(0);//����
		}else {
			control = true;
		}
	}
}
