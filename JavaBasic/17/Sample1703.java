/*
 * break ���g��Ȃ� �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1703 {
	public static void main(String[] args) {
		/*
		 * �z��̗v�f��\������B�������l���}�C�i�X�̗v�f������������
		 * ���̗v�f�ȍ~�̏������s��Ȃ��B
		 */
		// �z��
		int[] array = {10, 0, 5, -1, 9, -2, 3};

		// for ���[�v
		System.out.println("----break���g��Ȃ��p�^�[��----");
		boolean cont = true;		// �p���t���O��ON��
		for (int i = 0; (i < array.length) && cont; i++) {  //(i < array.length) && cont;i���z��̗v�f����菬�������p���t���O��true�̊Ԍp������
			// �}�C�i�X�̒l������������p���t���O��OFF��
			if (array[i] < 0) {  //array��0�ȉ��ł����false�ɂ��ďI��
				cont = false;
			} else {
				// �v�f�̕\��
				System.out.println("array["+ i + "]�F" + array[i]);
			}
		}
	}
}
