/*
 * ���\�b�h �T���v�� (�����������A�����Ȃ��j
 * �쐬�FM.Takahashi
 */
class Method0201 {
	/*
	//3�̃��\�b�h������main�@createIntro�@getDelimiter
	 * ���ȏЉ��\������
	 */
	public static void main(String[] args) {  
		//�ϐ��̐錾�A���������s���Ă���
		String n = "��������";					// ���O
		int a = 24;								// �N��
		String c = "�����V�X�e��";				// ��Ж�

		String result = createIntro(n, a, c);	// ���ȏЉ�쐬  //createIntro(n���ϐ���12�s��, a���ϐ���13�s��, c���ϐ���14�s��)���X�̕��������\�b�h�Ăяo��

		System.out.println(result);				// ���ʂ̕\��
	}

	/*
	 * ���ȏЉ�̕�������쐬����
	 * �����F	name ... ���O
	 * 			age ... �N��
	 * 			company ... �Ж�
	 * �߂�l�F	���ȏЉ����
	 */
	static String createIntro(String name, int age, String company) {
		String intro = getDelimiter();
//		intro += name + "(" + age + ")\n";
		intro += name + "\n�N��:" + age + "\n";
		intro += company + "\n";
		intro += getDelimiter();

		return intro;  //intro��߂�l�Ƃ���return���Ă���BcreateIntro(n, a, c)�ɖ߂��Ă���
	}

	/*
	 * ��؂����Ԃ�
	 * �����F	�Ȃ�
	 * �߂�l�F	��؂���i�{���s�j
	 */
	static String getDelimiter() /*���������Ȃ��Ă��ȗ����邱�Ƃ��ł��Ȃ�*/{
//		return "----------------\n";  //\n���s
		return "+ + + + +\n";  //\n���s
	}
}
