/*
 * ������Z�q
 * �쐬�FM.Takahashi
 */

class Sample0706 {
	public static void main(String[] args) {
		// �ϐ��錾�E������
		int a = 5;
		int b = 2;

		//�y=�z
		int result1 = a;
		System.out.println("result1�F" + result1);

		//�y+=�z
		int result2 = a;
		result2 += b;
		System.out.println("result2�F" + result2);

		//�y-=�z
		int result3 = a;
		result3 -= b;
		System.out.println("result3�F" + result3);

		//�y*=�z
		int result4 = a;
		result4 *= b;
		System.out.println("result4�F" + result4);

		//�y/=�z
		int result5 = a;
		result5 /= b;
		System.out.println("result5�F" + result5);

		//�y%=�z
		int result6 = a;
		result6 %= b;
		System.out.println("result6�F" + result6);

		//�y+=�z�i������̘A���j
		String result7 = "������A���F";
		result7 += b;
		System.out.println("result7�F" + result7);
	}
}
