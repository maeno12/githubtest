/*
 * ���\�b�h �T���v���i��{�f�[�^�^�̈����j
 * �쐬�FM.Takahashi
 */
class Method0401 {
	/* ��{�f�[�^�^�������Ƃ��ēn���e�X�g */
	public static void main(String[] args) {
		int a = 5;									// a �̐錾�E������

		System.out.println(a + "�F(a) in main\n");	// a �̕\��

		displayPlusOne(a);							// ���\�b�h�Ăяo��

		System.out.println(a + "�F(a) in main\n");	// a �̕\��
	}
	/*
	 * �����ɂP�𑫂��ĕ\������
	 * val�F�����l
	 * �߂�l�F�Ȃ�
	 */
	static void displayPlusOne(int val) {
		System.out.println(++val + "�F(val)in displayPlusOne\n");
	}
}
