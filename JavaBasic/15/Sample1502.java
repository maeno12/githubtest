/*
 * do-while �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1502 {
	public static void main(String[] args) {
		/*
		 * exit �����͂����܂ŌJ��Ԃ��B
		 * proc1 �͏����P�Aproc2 �͏����Q 
		 */
		// ���͕�����
		String input;
		// do - while ��
		do {
			// ���͂��󂯕t����
			System.out.print("\n����1=proc1,����2=proc2,�I��=exit > ");
			input = new java.util.Scanner(System.in).nextLine();

			// �����̐U����
			switch (input) {
				case "proc1":
					System.out.println("\n����1 ���s���܂����B");
					break;
				case "proc2":
					System.out.println("\n����2 ���s���܂����B");
					break;
				case "exit":
					System.out.println("\n���肪�Ƃ��������܂����B");
					break;
				default:
					System.out.println("\n���͕���������m�F���������B");
			}
		} while (!input.equals("exit"));	//exit�ȊO��������true�Ń��[�v�����p��exit��������false�Ń��[�v�����𔲂������̂ŁB
	}
}
