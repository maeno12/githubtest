/*
 * �����I�Ȍ^�ϊ��T���v��
 * �쐬�FM.Takahashi
 */
class Sample0802 {
	public static void main(String[] args) {
		// �萔�E�ϐ��̐錾�Ə�����
		final double TAX_RATE = 1.08;	// �ŗ�
		int price = 20;					// �艿

		// �|���Z�̌��ʂ� int�^�ϐ��ɑ��
		int result = (int) (price * TAX_RATE);
//		int result = (int) price * TAX_RATE;//�L���X�g���Z�q�̖@���D�揇�ʂ������̃R���p�C���G���[���N����
		System.out.println("result�F" + result);

		/*		//String�^��int�^
		String a = "10";
		int b = Intger.parseInt(a);
		//String�^��double�^
		String c = "12.34";
		double d = Double.parseDouble(c);
		//���l(int/double)�^��String�^
		int a = 10;
		String aStr = String.valueOf(a);
		�B���l(int/double)�^��String�^�i�����I�Ȍ^�ϊ������p�j
		int a = 10;
		String aStr = "" + a;
*/
	}
}
