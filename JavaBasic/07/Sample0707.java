/*
 * ���Z�q���Ƃ̗D�揇�ʁE�����@��
 * �쐬�FM.Takahashi
 */
class Sample0707 {
	public static void main(String[] args) {
		// �ϐ��錾�E������
		int a = 5;
		int b = 2;
		int c = 2;
		int d = 3;
		int e = 3;

		// �D�揇��
		boolean result1 = a + b * c == d * e;
		System.out.println("result1�F" + result1);

		boolean result2 = ((a + (b * c)) == (d * e));//�P�T�s�ڂƓ������ł�������t���Ă킩��₷��
		System.out.println("result2�F" + result2);

		// �����@��
		int result3 = a * b % d;//������v�Z
		System.out.println("result3�F" + result3);

		int result4 = a;
		int result5 = result4 += b;//���Ɓ{���͓����ŁA�����K���͉E���獶�@�܂�result4+b���v�Z����āA���ꂪ�Aresult5�ɑ�������
//		int result4 += b; // 26�s�ڂ�2�s�ŕ\���Ă킩��₷���\��
//		int result5 = result4; //
		System.out.println("result4�F" + result4);
		System.out.println("result5�F" + result5);
	}
}
