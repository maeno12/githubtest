/*
 * ���\�b�h �T���v���i�z��̎󂯓n���j
 * �쐬�FM.Takahashi
 */
class Method0301 {
	/*
	�Q�̃��\�b�h�����݂���main��getIntArray���\�b�h
	 * double�^ �z��� int�^�z��ɕϊ����ĕ\��
	 */
	public static void main(String[] args) {
		// double�^ �z��̐錾�E������
		double[] arrayDouble/*25�s�ڂ̉������Ɠ����`*/= {10.3, 20.9, 35.7};
		// int�^ �z��̎擾
		int[] arrayInt = getIntArray(arrayDouble);/*��25�s�ڂƓ����ϐ���*///���\�b�h���Ăяo�����̎�������11�s�ڂŏ���������double�^�z��arrayDouble//int[] arrayInt�͔z��
		// ���ʕ\��
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
	}
	/*
	 * double �z��� int�^�z�� �ɕϊ�
	 * �����F	arrayDouble ... double�^�z��
	 * �߂�l�F	int�^�z��
	 */
	static int[]/*�߂�l��int�^�z��*/ getIntArray(double[] arrayDouble) {/*��������double�^�z���arrayDouble*/
		// ���ʔz��̐錾�E�v�f�̗̈�m��
		int[] result = new int[arrayDouble.length];//����arrayDouble.length�́A�󂯎����double�^�z��̗v�f���Ɠ����v�f�������m�ې����適�z��̉񐔂����v�Z����̐������������Ƃ��Ă�������������K�v�͂Ȃ��B
		// ���ʔz��ւ̒l�̐ݒ�
		for (int i = 0; i < arrayDouble.length; i++) {
			result[i] = (int) arrayDouble[i];
		}
		return result;		// ���ʂ�߂�
	}
}
