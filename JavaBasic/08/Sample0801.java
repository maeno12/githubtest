/*
 * �����I�Ȍ^�ϊ��T���v��
 * �쐬�FM.Takahashi
 */
class Sample0801 {
	public static void main(String[] args) {
		int a = 10;		// int�^�ϐ��̐錾�E������

		// ������̎����I�Ȍ^�ϊ�
		double b = a;	// double�^ <- int�^ ���̂Ƃ��ɁA�E�ӂ̒l��int�^����double�^�Ɉꎞ�I�Ɍ^�ϊ������double�^�ɂȂ��Ă��獶�ӂ�b�ɑ��
		System.out.println("b�F" + b);

		// ���Z���̎����I�Ȍ^�ϊ��i�]�����Ɍ^�����܂�j
		double c = 3 / 2 * 2.0;
		System.out.println("c�F" + c);

		double d = 3.0 / 2 * 2.0;
		System.out.println("d�F" + d);

		// ���Z���̎����I�Ȍ^�ϊ��iString�^�̘A���j
		int e = 50;
		int f = 20;
		String g = e + f + "�~�����v�ł��B";
		System.out.println("g�F" + g);

//		String h = "���v��" + e + f + "�~�ł��B";//������A�����N���荇�v 2050�Ƃ��������ɂȂ��Ă��܂��B
		String h = "���v��" + ( e + f ) + "�~�ł��B";//������A�����N�����Ȃ���Ɂi�j�ŗD�揇�ʂ𖾊m������
		System.out.println("h�F" + h);
	}
}
