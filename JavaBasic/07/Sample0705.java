/*
 * �_�����Z�q�̃T���v��
 * �쐬�FM.Takahashi
 */
class Sample0705 {
	public static void main(String[] args) {
		// �ϐ��錾�E������
		//���鋳�Ȃ̃X�R�A��������
		int aScore = 85;
		int bScore = 78;
		
		//�y&&�z
		boolean result1 = (aScore >= 80) && (bScore >= 80);//���ӂ�true�̎���true
		System.out.println("result1�F" + result1);

		//�y||�z
		boolean result2 = (aScore >= 80) || (bScore >= 80);//�ǂ��炩�����true�ł���΁Atrue
		System.out.println("result2�F" + result2);
		
		//�y!�z
		boolean result3 = !(aScore >= 80);//aScore��80�ȉ�����˂ƕ����Ă���̂ŁA�W�O�ȏゾ����false
		System.out.println("result3�F" + result3);
	}
}
