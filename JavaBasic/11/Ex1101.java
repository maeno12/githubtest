class Ex1101{
	public static void main(String[] args){
		//�E�L�[�{�[�h����e�X�g�̓_�����󂯕t���Aint�^�ɕϊ���int�^�ϐ��ɑ�����܂��B
		//�E�U�O�_�����̏ꍇ�ɂ́A�L�[�{�[�h�����C��u�̗L����"yes"/"no"�Ŏ󂯕t���AString�^�ϐ��ɑ�����܂�l�B
		//[�]��]
		//�W�O�_�ȏ�E�EA�]��
		//�U�O�_�ȏ�W�O�_�����E�EB�]��
		//�U�O�_�����E�EC�]��(��K���󂯂��j
		//�@�@�@�@�E�E�ED�]���i��K���󂯂Ă��Ȃ�)
		
		//�ϐ��錾
		String result;  //�]������
		int score;      //�_��
		String addStudy = null; //��K���󂯂�("yes"/"no")
		
		//�_������
		System.out.println("\n�_������͂��Ă���������");
		String str = new java.util.Scanner(System.in).nextLine();
		score = Integer.parseInt(str);
		
		//60�_�����̎��ɕ�K�̗L���𕷂�
		if (score < 60) {
		    System.out.println("\n��K���󂯂܂������H(yes/no) >");
			addStudy = new java.util.Scanner(System.in).nextLine();
		}
		//����
		if (80 <= score) {
			result = "A�]��";
		} else if (60 <= score){
		    result = "B�]��";
		} else if (addStudy.equals("yes")) {
			result = "C�]��";
		} else {
			result = "D�]��";
		//���ʂ̕\��
			System.out.println("\n���ʁF" + result);
		}
	}
}