package day5;

public class PrintAlphabetEx1 {

	public static void main(String[] args) {
		/*z���� a���� ��µǵ��� �ڵ带 �ۼ��ϼ���.
		 * */
		char ch;
		for(ch = 'z'; ch >= 'a'; ch--) {
			System.out.print(ch + " ");
		}
		System.out.println();
		int i = 0;
		while(i < 26) {
			System.out.print((char)('z' - i) + " ");
			i++;
		}
	}

}
