class EX1401 {
	public static void main (String[] args){
		//�u3�Â��₵�ĕ\�����܂��B�v
		//�K�C�h���b�Z�[�W�\��
		System.out.println("\n3�����₵�ĕ\�����܂��B");
		//�L�[�{�[�h����ŏ��l���󂯕t���Aint�^�ɕϊ���int�^�ϐ��ɑ��
		System.out.println("\n�ŏ��l����͂��Ă��������B��");
		String minStr = new java.util.Scanner(System.in).nextLine();
		int min = Integer.parseInt(minStr);
		//�L�[�{�[�h����ő�l���󂯕t���Aint�^�ɕϊ���int�^�ϊ��ɑ�����܂��B
		System.out.println("\n�ő�l����͂��Ă��������B��");
		String maxStr = new java.util.Scanner(System.in).nextLine();
		int max = Integer.parseInt(maxStr);
		
		System.out.println();   //��s��\��
		//�ŏ��l����A�R�Â��₵�ĕ\�����Ă����܂��B
		//�ő�l�ȉ��ł���ԁA�\���������܂��B
		//�J��Ԃ�(for ���[�v)
		int count = 0;
		for (int i = min; i <= max; i +=3) {
			System.out.println(i);
			count++;
		}
		//�����āA�Ō�Ɍ���\�����܂��B
		//�i��j�ŏ��l�F�P,�ő�l�F�P�O�̏ꍇ
		System.out.println("---");
		System.out.println("��" + count);
		
		
	}
}