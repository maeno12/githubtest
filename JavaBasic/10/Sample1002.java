/*
 * if - else �T���v���i�֌W���Z�q�E�_�����Z�q�j
 * �쐬�FM.Takahashi
 */
class Sample1002 {
	public static void main(String[] args) {
		// �\�����e
		String result;

		// �N�����
		System.out.print("\n�N�����͂��Ă������� > ");
		String str = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(str);

		// �\�����ʂ̐ݒ�
		if ((20 <= age) && (age < 30)) { //�����𖞂������Ƃ���true
			result = "20��ł��B";
		} else {
			result = "20��ł͂���܂���B";
		}

		// ���ʂ̕\��
		System.out.println("\n���ʁF" + result);
	}
}
