/*
 * ���\�b�h �T���v���P
 * �쐬�FM.Takahashi
 */
class Method0101 {
	/*
	 * ���C�����\�b�h�F�Q�悵�����ʂ�\������
	 */
	public static void main(String[] args) {

		// ���\�b�h�Ăяo��
		int valSquared = square(3);

		// �\��
		System.out.println("3 �� 2��� " + valSquared);
	}

	/*
	 * �Q�悷�郁�\�b�h
	 * �����F	value ...�Q�悷��l
	 * �߂�l�F	�Q�悵������
	 */
	static int square(int value) {

		int result = value * value;

		return result;
	}
}
