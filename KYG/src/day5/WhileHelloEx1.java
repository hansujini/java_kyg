package day5;

public class WhileHelloEx1 {

	public static void main(String[] args) {
		/* Hello�� 5�� ����ϴ� �ڵ带 while������ �ۼ��ϼ���.
		 * �ݺ�Ƚ�� : i�� 1���� 5���� 1�� ����
		 * ��Ģ��(���๮) : Hello�� ���
		 * */
		int i = 1; // 1. �ʱ�ȭ
		while(i <= 5) { //2. ���ǽ�
			System.out.println("Hello"); // 3.���๮
			i++; // 4.������
				
		}
		i = 5;
		while(i-- > 0) {
			System.out.println("Hello");
		}
	}

}
