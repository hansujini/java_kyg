package day5;

public class StarEx3 {

	public static void main(String[] args) {
		/*       *
		 *      **
		 *     *** 
		 *    ****
		 *   *****
		 *   ���� ���� ��µǵ��� �ڵ带 �ۼ��ϼ���. 
		 * */
		int i, j;
		for(i = 5; i >= 1; i--) {
			for(j = 1; j <=5 ; j++) {
				if(i > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//����� ���
		/*       *  i = 1 ���� = 4 * = 1
		 *      **  i = 2 ���� = 3 * = 1
		 *     ***  i = 3 ���� = 2 * = 1
		 *    ****  i = 4 ���� = 1 * = 1
		 *   *****  i = 5 ���� = 0 * = 1
		 * 			����= 5 - i * = i
		 */
		int num = 5;
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
