class Ex1701 {
	public static void main(String[] args) {
		//���l���i�[���ꂽ�z��̗v�f��\�����܂��B
		//�X�X�͕\�����܂���B
		//�X�X���R��A��������ȍ~��\�����܂���B
		//��1 int[] arr = {11,12,99,99,15,99,27,28,29,30};
		int[] arr = {11,12,99,99,15,99,27,28,29,30};
		//��2 int[] arr = {11,12,99,99,99,26,27,28,29,30};
		//int[] arr = {11,12,99,99,99,26,27,28,29,30};
		
		int qqCnt = 0; //�X�X�A���J�E���g�p
		
		//�����\�����郋�[�v
		System.out.println("---break���g���p�^�[��---");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=99) {
				//�v�f���X�X�ȊO�Ȃ�\�����āA�A���J�E���g���O�ɖ߂�
				System.out.println(arr[i]);
				qqCnt = 0;
			}else {
				//�v�f���X�X�Ȃ�A���J�E���g���C���N�������g���R��ɒB�����甲����
				qqCnt++;
				if (3 <= qqCnt) {
					break;
				}
			}
		}
		/*
		System.out.println("---break���g��Ȃ��p�^�[��----");
			for (int i = 0; (i < arr.length) && (qqCnt < 3; i++){
				if (arr[i] ! = 99) {
					//�v�f���X�X�ȊO�Ȃ�\�����āA�A���J�E���g���O�ɖ߂�
					System.out.println(arr[i]);
					qqCnt = 0;
				}else {
					//�v�f���X�X�Ȃ�A���J�E���g���C���N�������g
					qqCnt++;
				
			}
				
		*/
		
	}
}