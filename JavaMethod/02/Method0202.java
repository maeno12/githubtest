/*
 * ���\�b�h �T���v�� (�߂�l�Ȃ�)
 * �쐬�FM.Takahashi
 */
class Method0202 {
	/*
	3�̃��\�b�h�����݁@displayIntro�@main�@displayDelimiter
	 * ���ȏЉ��\������
	 */
	public static void main(String[] args) {
		String n = "��������";					// ���O
		int a = 24;								// �N��
		String c = "�����V�X�e��";				// ��Ж�

		  //Method0202.java:15: �G���[: �s�K���Ȍ^: void��String�ɕϊ��ł��܂���:
		/*String result = */ displayIntro(n, a, c);					// ���ȏЉ�̕\��//25�s�ڂ̔��
	}

	/*
	 * ���ȏЉ�̕������\��
	 * �����F	name ... ���O
	 * 			age ... �N��
	 * 			company ... �Ж�
	 * �߂�l�F	�Ȃ�
	 */
	static void displayIntro(String name, int age, String company) {  //void�ȂǂŖ߂�l���Ȃ����Ƃ��m�F�@displayIntro���\�b�h�́A�߂�l���Ȃ��̂ŁA����≉�Z�ȂǂɎg�p���邱�Ƃ��ł����Ăяo���̂�
		displayDelimiter();//�߂�l���Ȃ��̂ŁA�Ăяo�������̃��\�b�h
		System.out.println(name + "(" + age + ")");
		System.out.println(company);
		displayDelimiter();
		//�\�����邾���Ŗ߂�l���Ȃ�����return���ȗ�
	}

	/*
	��؂���̕\������\�����郁�\�b�h
	 * ��؂����\������
	 * �����F	�Ȃ�
	 * �߂�l�F	�Ȃ�
	 */
	static void displayDelimiter() {  //()��void�͖߂�l�Ȃ��@�߂�l���Ȃ��Ă�()�͏���
		System.out.println("----------------");
		//�߂�l���Ȃ�����return���ȗ�
	}
}
