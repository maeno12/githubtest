/*
 * String�^�̌^�ϊ��T���v��
 * �쐬�FM.Takahashi
 */
class Sample0803 {
	public static void main(String[] args) {
		// �������int�^
		System.out.print("int�^�̒l����͂��Ă������� > ");//���s�����ɕ\��
		String a = new java.util.Scanner(System.in).nextLine();//�L�[�{�[�h������͂���1�s��String�^�ϐ�a�ɑ��
		int b = Integer.parseInt(a); //String�^����int�^�Ɍ^�ϊ�

		// �������double�^
		System.out.print("double�^�̒l����͂��Ă������� > ");
		String c = new java.util.Scanner(System.in).nextLine();//�L�[�{�[�h������͂���1�s��String�^�ϐ�c�ɑ��
		double d = Double.parseDouble(c);//String�^����double�^�Ɍ^�ϊ�

		// �|���Z�̌��ʂ̕\��
		System.out.println("\n("+ b + "�~" + d + ")�̌��ʂ�\t" + b * d);//���Z�q��+��*�̂ł��ˁB*���D�揇�ʂ�����b*d���ŏ��ɕ]��//\n�͉��s�@"+ b + "�~" + d + "���g�𕶎���ŕ\�����Ă���B\t�̓^�u

		// ���l(int�Edouble)�˕�����̕ϊ�
		String bStr = String.valueOf(b);//10�s�ڂ�int�^�ϐ���String�^�ɕϊ�
		String dStr = String.valueOf(d);//15�s�ڂ�double�^�ϐ���String�^�ɕϊ�
		System.out.println("\n������ϊ��E�A����\t"+ bStr + dStr);//\n���s�@\t �^�u
	}
}
