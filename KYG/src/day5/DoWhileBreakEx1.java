package day5;

import java.util.Scanner;

public class DoWhileBreakEx1 {

	public static void main(String[] args) {
		/* 0�� �Է��� ������ ������ ��� �Է¹޴� �ڵ带 �ۼ��ϼ���.
		 *  */
		int num = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("������ �Է��ϼ��� : ");
			num = scan.nextInt();
		}while(num != 0);
		
		scan.close();

	}

}
