/*
 * ���\�b�h���K02-01
 * �쐬�FM.Takahashi
 */
class ExMethod0201 {
	/*
	�ۑ�ɂȂ��Ă���3�̃��\�b�h��main���\�b�h������B
	 * ���C�����\�b�h�i�����Q�𑫂��Z���ĕ\������j
	 */
	public static void main(String[] args) {
		int first = inputInt();				// ��������//inputInt�̒��g���󂯎����first�ɑ��
		int second = inputInt();			// ��������//inputInt�̒��g���󂯎����second�ɑ��
		displayAddResult(first, second);	// �Q�̐��E���v�\����displayAddResult(first, second)���Ăяo���������́Afirst��second�ŁA���̃��\�b�h�͖߂�l���Ȃ��̂ŌĂяo������
	}
	/*
	 * ��s���͂��󂯕t���Đ����ɕϊ�����
	 * �����F	�Ȃ�
	 * �߂�l�F	���͂��ꂽ�����l
	 */
	static int inputInt() {
		System.out.print("��������͂��Ă������� > ");
		String str = new java.util.Scanner(System.in).nextLine();//���ʂ�String�^��str�ɑ��
		int val = Integer.parseInt(str);//str��int�^�ɕϊ�//int�^�ϐ�val�ɑ��value�̗�

		return val;
	}
	/*
	 * �Q�̐���\�����A���v��\������
	 * �����F	num1 ... �P�Ԗڂ̐���
	 *			num2 ... �Q�Ԃ߂̐���
	 * �߂�l�F	�Ȃ���void���w��
	 */
	static void displayAddResult(int num1, int num2) {//�������Ƃ���2�󂯎��int num1, int num2
		displayDelimiter();						// ��؂��
		System.out.println("���l�P�F" + num1);
		System.out.println("���l�Q�F" + num2);
		displayDelimiter();						// ��؂��
		System.out.println("���v�F" + (num1 + num2));
		displayDelimiter();						// ��؂��
	}
	/*
	 * ��؂����\������
	 * �����F	�Ȃ�
	 * �߂�l�F	�Ȃ���void���w��
	 */
	static void displayDelimiter() {//�����Ȃ��Ȃ̂ŉ��������Ȃ��ۊ��ʎ��̂͏ȗ��ł��Ȃ�
		System.out.println("----------------");
	}
}
