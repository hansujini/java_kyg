package day5;

public class StarEx1 {

	public static void main(String[] args) {
		/* �ݺ����� �̿��Ͽ� ������ ���� ��µǴ� �ڵ带 �ۼ��ϼ���.
		 * *****	i = 1  *���� = 5
		 * *****	i = 2  *���� = 5
		 * *****	i = 3  *���� = 5
		 * *****	i = 4  *���� = 5
		 * *****	i = 5  *���� = 5
		 * �ݺ�Ƚ�� : i�� 1���� 5���� 1�� ����
		 * ��Ģ�� : *�� 5���� ���
		 * 		  �ݺ�Ƚ�� : j �� 1���� 5���� 1�� ����
		 * 		  ��Ģ�� : *�� ���
		 * */
		int i , j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
