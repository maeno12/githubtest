class ExMethod03 {
	/*
	�Q�̃��\�b�h�����݂���main��getIntArray���\�b�h
	 * double�^ �z��� int�^�z�� �ɕϊ����ĕ\��
	 */
	public static void main(String[] args) {
		// double�^ �z��̐錾�E������
		int[] arrayInt/*25�s�ڂ̉������Ɠ����`*/= {3.5.8};
		// int�^ �z��̎擾
		int[] arrayInt = total(arrayInt);/*��25�s�ڂƓ����ϐ���*///���\�b�h���Ăяo�����̎�������11�s�ڂŏ���������double�^�z��arrayDouble//int[] arrayInt�͔z��
		// ���ʕ\��for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
	/*
	 * double �z��� int�^�z�� �ɕϊ�
	 * �����F	arrayDouble ... double�^�z��
	 * �߂�l�F	int�^�z��
	 */
	static int[] total(int[] arrayInt) {
		// ���ʔz��̐錾�E�v�f�̗̈�m��
		int[] result = new int[arrayInt.length];//����arrayDouble.length�́A�󂯎����double�^�z��̗v�f���Ɠ����v�f�������m�ې����適�z��̉񐔂����v�Z����̐������������Ƃ��Ă�������������K�v�͂Ȃ��B
		// ���ʔz��ւ̒l�̐ݒ�
		for (int i = 0; i < arrayInt.length; i++) {
			result[i] += (int) arrayInt[i];
		}
		return result;		// ���ʂ�߂�
	}
}