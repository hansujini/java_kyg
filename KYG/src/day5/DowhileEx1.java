package day5;

public class DowhileEx1 {

	public static void main(String[] args) {
		/* do while���� �̿��� Hello 5�� ��� ����
		 * 
		 * */
		int i = 1;
		do {
			System.out.println("Hello");
			i++;
		}while(i <= 5);
		/* ������ �ʱⰪ�� 10���� �����ؼ� 5���� �۰ų� ���� ������ ����ϴ� ����
		 * �ʱⰪ�� �߸� ������ ���
		 */
		System.out.println("for���� �̿�");
		for(i = 10; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("do while���� �̿�");
		i = 10;
		do {
			System.out.println(i + " ");
			i++;
		}while(i <= 5);
	}

}
