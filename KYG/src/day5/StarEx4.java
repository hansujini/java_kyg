package day5;

public class StarEx4 {

	public static void main(String[] args) {
		/* ������ ���� ��µǵ��� �ڵ带 �ۼ��ϼ���.
		 *     *
		 *    ***    
		 *   *****   
		 *  *******
		 * *********
		 */
		
		int num = 5, i, j;
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		i = 1;
		while(i <= num) {
			j = 1;
			while(j <= num - i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while(j <= (2 * i) - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
}

