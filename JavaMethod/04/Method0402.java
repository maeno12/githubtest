/*
 * ���\�b�h �T���v���i�Q�ƌ^�̈����j
 * �쐬�FM.Takahashi
 */
class Method0402 {
	/* �Q�ƌ^�������Ƃ��ēn���e�X�g */
	public static void main(String[] args) {
		int[] a = {10, 3, 6};						// a �̐錾�E������

		for (int i = 0; i < a.length; i++) {		// a �̗v�f�̕\��
			System.out.print(a[i] + " ");
		}
		System.out.println("�F(a[]) in main\n");

		displayArrayPlusOne(a);						// ���\�b�h�Ăяo��

		for (int i = 0; i < a.length; i++) {		// a �̗v�f�̕\��
			System.out.print(a[i] + " ");
		}
		System.out.println("�F(a[]) in main\n");
	}
	/*
	 * �����̔z��v�f�ɂP�𑫂��ĕ\������
	 * array�Fint�^�z��
	 * �߂�l�F�Ȃ�
	 */
	static void displayArrayPlusOne(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(++array[i] + " ");
		}
		System.out.println("�F(array[]) in displayArrayPlusOne\n");
	}
}
