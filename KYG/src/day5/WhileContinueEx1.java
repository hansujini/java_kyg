package day5;

public class WhileContinueEx1 {

	public static void main(String[] args) {
		/* 1~10������ Ȧ���� while���� �̿��Ͽ� ����ϴ� ����
		 * 
		 */
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				i++;
				continue;
			}
		System.out.print(i + " ");
		i++;
		}
		i = 0;
		System.out.println();
		while(i < 10) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
		System.out.print(i + " ");
		
		}
	}

}
