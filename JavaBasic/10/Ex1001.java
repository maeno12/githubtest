class Ex1001{
	public static void main(String[] args){
		//���ʕ\���p
		String result;
		//�E�L�[�{�[�h����P�s�̓��͂��󂯕t���Aint�^�ɕω���int�^�ϐ��ɑ��
		//��������
		System.out.print("\n��������͂��Ă���������");
		String str = new java.util.Scanner(System.in).nextLine();
		int num = Integer.parseInt(str);
		//���͒l���P�ȏ�P�O�O�ȉ��̏ꍇ�Ɂu�c�͂P�`�P�O�O�͈͓̔��ł��B�v�ƕ\��
			if ((1 <= num) && (num <= 100)) {
				result = "1~100�͈͓̔��ł��B";
		//�E�����łȂ��ꍇ�u�E�E�͂P�`�P�O�O�͈̔͊O�ł��B�v�ƕ\�����܂��B
			} else {
				result = "1~100�͈̔͊O�ł��B";
			}
				System.out.println("\n" + num + "��" + result);
	}
}
