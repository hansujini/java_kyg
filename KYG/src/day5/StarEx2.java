package day5;

public class StarEx2 {

	public static void main(String[] args) {
		/* ������ ���� ��µǵ��� �ݺ����� �̿��Ͽ� �ڵ带 �ۼ��ϼ���.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * */
		int i, j;
		i = 1;
		while(i <= 5) {
			j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		for(i = 1; i <= 5 ; i++) {
			for(j = 1; j <= i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
