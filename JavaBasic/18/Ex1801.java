class Ex1801 {
	public static void main(String[] args) {
		//���i���E�X�ܖ��E���z�̔z���錾���ȉ��̂悤�ɏ��������܂��B
		//[���i��]
		//�h�{�[���y���h�A�h�m�[�g�h�A�h�tⳎ��h�A�h�e�[�v�h�A�h�z�b�`�L�X�h
		String item[] = {   //���i��
			"�{�[���y��","�m�[�g","�tⳎ�","�e�[�v","�z�b�`�L�X"
		};
		//[�X�ܖ�]
		//�hA�X�܁h�A�hB�X�܁h�A�hC�X�܁h
		String shop[] = {   //�X�ܖ�
			"A�X��","B�X��","C�X��"
		};
		//[���z]
	    //�o�X�O�C�W�O�C�X�W�C�X�T�D�W�V�p
	    //�o�P�P�O�C�P�Q�O�C�P�R�O�C�P�S�O�A�P�T�O�p
	    //�o�Q�P�O�C�Q�Q�O�C�Q�R�O�C�Q�S�O�D�Q�T�O�p
		int price[] [] =  {           //���z
			{90,80,98,95,87},
			{110,120,130,140,150},
			{210,220,230,240,250}
		};
		//�J��Ԃ�(for - �z��)
		System.out.println("-------");
		for (int i = 0; i < price.length; i++) {
			System.out.println("["+ shop[i] + "]");
			for (int j = 0; j < price[i].length; j++){
				System.out.println(
					item[j] + ":" + price[i][j] + "�~"
				);
			}
			System.out.println("----------");
		}
		
		
	}
}