package day5;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/* while���� �̿��Ͽ� ������ 7���� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 *
		 */
		int i = 1;
		int num = 7;
		while(i <= 9) {
			System.out.println(num + " x " + i + " = " + (num * i));
			i++;
		}
		i = 1;
		num = 6;
		while(i <= 9) {
			System.out.println(num + " x " + i + " = " + (num * i++));
		}
	}

}

