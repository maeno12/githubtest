/*
 * �_�����Z�q�̃T���v��
 * �쐬�FM.Takahashi
 */
class Sample0705 {
	public static void main(String[] args) {
		// �ϐ��錾�E������
		int aScore = 85;
		int bScore = 78;
		
		//�y&&�z
		boolean result1 = (aScore >= 80) && (bScore >= 80);
		System.out.println("result1�F" + result1);

		//�y||�z
		boolean result2 = (aScore >= 80) || (bScore >= 80);
		System.out.println("result2�F" + result2);
		
		//�y!�z
		boolean result3 = !(aScore >= 80);
		System.out.println("result3�F" + result3);
	}
}
