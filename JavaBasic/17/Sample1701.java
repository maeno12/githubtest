/*
 * break �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1701 {
	public static void main(String[] args) {
		/*
		 * �z��̗v�f��\������B�������l���}�C�i�X�̗v�f������������
		 * ���̗v�f�ȍ~�̏������s��Ȃ��B
		 */
		// �z��
		int[] array = {10, 0, 5, -1, 9, -2, 3};

		// for ���[�v
		for (int i = 0; i < array.length; i++) {
			// �}�C�i�X�̒l�����������烋�[�v�𔲂���
			if (array[i] < 0) {   //array[i] < 0 if�̏������́A�z��array��i�Ԗڂ̗v�f��0��菬����������Abreak��for���[�v�𔲂��܂��B
				break;
			}
			// �v�f�̕\��
			System.out.println("array["+ i + "]�F" + array[i]);
		}
	}
}
