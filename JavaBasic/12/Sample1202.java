/*
 * switch �T���v���i������j
 * �쐬�FM.Takahashi
 */
class Sample1202 {
	public static void main(String[] args) {
		// ���������
		System.out.print("\n�D���ȐH�ו��́H > ");
		String str = new java.util.Scanner(System.in).nextLine();

		// ����
		switch (str) {
			case "�J���["://equals�Ŕ�ׂ�K�v���Ȃ�
				System.out.println("\n" + str + "�́A�l���D���ł��B");
				break;
			case "���[����":
				System.out.println("\n" + str + "�́A�F�X�Ȏ�ނ�����܂��ˁB");
				break;
			default:
				System.out.println("\n" + str + "�Ȃ�ł��ˁB");
		}
	}
}
