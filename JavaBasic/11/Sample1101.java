/*
 * if, if-else if-else, �������r �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1101 {
	public static void main(String[] args) {
		// �y��ԗ����z
		// 6�Ζ����F		0�~
		// 6�Έȏ�12�Ζ����F1000�~
		// 12�Έȏ�F		2000�~�i�ʏ�j
		//					1500�~�i����������j

		// �ϐ��錾
		int result;			// ���i
		int age;			// �N��
		String discTicket = null;	// ������ ("yes"/"no")//null�ŏ�����

		// �N�����
		System.out.print("\n�N�����͂��Ă������� > ");
		String ageStr = new java.util.Scanner(System.in).nextLine();//���������s����
		age = Integer.parseInt(ageStr);//�������int�^�ɕϊ�

		// 12�Έȏ�̏ꍇ�̂ݏ��� (if �̂�)//������12�Έȏ�̏ꍇ�����A�������̗L�����m�F������
		if (12 <= age) {
			// �������̗L���̓���
			System.out.print("\n�������͂���܂����H (yes/no) > ");
			discTicket = new java.util.Scanner(System.in).nextLine();//���͂��ꂽ�������discTicket�ɑ��
		}

		// ���i�̌��� (if - else if �E�������r�j
		if (age < 6) {
			result = 0;
		} else if (age < 12) {
			result = 1000;
		} else if (discTicket.equals("yes")) {//26�s�ڂ�yes���ǂ����m�F//String�^�ϐ�.equals(��r�Ώ�)
			result = 1500;
		} else {
			result = 2000;
		}

		// �����̕\��
		System.out.println("\n�����F" + result + "�~");//if���̌��ʂ���������
	}
}
