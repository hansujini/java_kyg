package day5;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		//�迭 arr�� 0������ 1�� ����
		arr[0] = 1;
		System.out.println("0������ �� : " + arr[0]);
		arr[1] = 2;
		System.out.println("1������ �� : " + arr[1]);
		arr[2] = 3;
		System.out.println("2������ �� : " + arr[2]);
		arr[3] = 4;
		System.out.println("3������ �� : " + arr[3]);
		arr[4] = 5;
		System.out.println("4������ �� : " + arr[4]);
		
		System.out.println("===========================");
		
		int i;
		for(i = 0; i < 5; i++) {
			arr[i] = i + 1;
			System.out.println(i + "������ �� : " + arr[i]);
		}
		
		System.out.println("===========================");
		
		int num1, num2, num3, num4, num5;
		num1 =1;
		System.out.println("num1�� �� : " + num1);
		num2 =2;
		System.out.println("num2�� �� : " + num2);
		num3 =3;
		System.out.println("num3�� �� : " + num3);
		num4 =4;
		System.out.println("num4�� �� : " + num4);
		num5 =5;
		System.out.println("num5�� �� : " + num5);
		

	}

}
