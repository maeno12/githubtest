class Ex0802{
	public static void main(String[] args){
		//1.���̐����̓��͂���t��aStr�ɑ��
		System.out.println("���̐�������͂��Ă�������");
		String aStr = new java.util.Scanner(System.in).nextLine();
		//aStr��int�^�ɕϊ���int�^�ϐ���a�ɑ�����܂��B
		int a = Integer.parseInt(aStr);
		//���̐�������͂���tbStr�ɑ��
		System.out.println("���̐�������͂��Ă�������");
		String bStr = new java.util.Scanner(System.in).nextLine();
		//bStr��int�^�ɕϊ���int�^�ϐ�b�ɑ��
		int b = Integer.parseInt(bStr);
		//����Z�����āA�ȉ��̂悤�ɕ\�����Ă�������
		System.out.println("��:"+a/b);
		System.out.println("�]��:"+a%b);
	}
}

		