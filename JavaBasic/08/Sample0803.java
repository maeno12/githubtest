/*
 * String�^�̌^�ϊ��T���v��
 * �쐬�FM.Takahashi
 */
class Sample0803 {
	public static void main(String[] args) {
		// �������int�^
		System.out.print("int�^�̒l����͂��Ă������� > ");
		String a = new java.util.Scanner(System.in).nextLine();
		int b = Integer.parseInt(a);

		// �������double�^
		System.out.print("double�^�̒l����͂��Ă������� > ");
		String c = new java.util.Scanner(System.in).nextLine();
		double d = Double.parseDouble(c);

		// �|���Z�̌��ʂ̕\��
		System.out.println("\n("+ b + "�~" + d + ")�̌��ʂ�\t" + b * d);

		// ���l(int�Edouble)�˕�����̕ϊ�
		String bStr = String.valueOf(b);
		String dStr = String.valueOf(d);
		System.out.println("\n������ϊ��E�A����\t"+ bStr + dStr);
	}
}
