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
//		int result = (int) price * TAX_RATE;
		System.out.println("result�F" + result);
	}
}
