class Ex1601 {
	public static void main(String[] args) {
		//���i�̔z�񂩂�i�v�f���T�j��錾���āA�ȉ��̕���������������܂��B�{�[���y���A�m�[�g�A�tⳎ��A�e�[�v�A�z�b�`�L�X
		//���z�̔z��i�v�f���T�j��錾���āA�ȉ��̋��z�ŏ��������܂��B�X�O�C�W�O�C�P�P�O�C�X�T�C�Q�O
		//���i�̖��O�Ƌ��z
		String item[] = {
		"�{�[���y��","�m�[�g","�tⳎ�","�e�[�v","�z�b�`�L�X"
	};
	int  price[] = {90, 80, 110, 95, 200};//�C�ɂ���
		
		//�e���i�ɑ΂��āu���i���F���z�v�̌`����\�����A���z���P�O�O�ȏ�̏��i�Ɂi���j�����ĕ\�����Ă��������B
		//�J��Ԃ�(for - �z��)
		System.out.println();
		for (int i = 0; i < item.length; i++) {
			String str = item[i] + ":" + price[i] + "�~";
			if (100 <= price[i]) {
				str  += "(*)";
		   }
			System.out.println(str);
		}
	}
}
