/*
 * �C���N�������g���Z�q�E�f�N�������g���Z�q�̃T���v��
 * �쐬�FM.Takahashi
 */
class Sample0703 {
	public static void main(String[] args) {
		// �ϐ��錾�E������
		int a;

		// ��u�C���N�������g
		a = 5;
		int result1 = a++;  //�]�����Ă���
		System.out.println("result1�F" + result1);	// 5
		System.out.println("a�F" + a);				// 6

		// �O�u�C���N�������g
		a = 5;
		int result2 = ++a;  //�����Ă���
		System.out.println("result2�F" + result2);	// 6
		System.out.println("a�F" + a);				// 6
		
		// ��u�f�N�������g
		a = 5;
		int result3 = a--;  //�]�����Ă���
		System.out.println("result3�F" + result3);	// 5
		System.out.println("a�F" + a);				// 4

		// �O�u�f�N�������g
		a = 5;
		int result4 = --a;  //��������
		System.out.println("result4�F" + result4);	// 4
		System.out.println("a�F" + a);				// 4
	}
}
