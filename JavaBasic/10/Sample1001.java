/*
 * if - else �T���v���i�֌W���Z�q�j
 * �쐬�FM.Takahashi
 */
class Sample1001 {
	public static void main(String[] args) {
		// ����
		int result;

		// �N�����
		System.out.print("\n�N�����͂��Ă������� > ");
		String str = new java.util.Scanner(System.in).nextLine(); //str�ɑ��String�^
		int age = Integer.parseInt(str); //String�^��int�^�Ɍ^�ϊ�

		//�\��Έȏ��2000�~�ňȉ��͐�~
		// �����̐ݒ�i��������j
		//�K���ǂ��炩��������s�����
		if (age >= 12) {
			result = 2000;
		} else {
			result = 1000;
		}

		// �����̕\��
		System.out.println("\n�����F" + result + "�~");
	}
}
