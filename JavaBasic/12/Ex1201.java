class Ex1201{
	public static void main(String[] args){
		//1~13�̂����ꂩ����͂��Ă����������ƕ\����
		System.out.print("\n1~13�̂����ꂩ����͂��Ă���������");
		String input = new java.util.Scanner(System.in).nextLine();
		int card = Integer.parseInt(input);
		//���͂��󂯓���int�^�ϐ��ɑ����
		//�l�ɉ������g�����v�̎�ނ�\�����Ă��������B
		//�\�����镶����̐ݒ�
		String str;
		switch (card) {
		case 1:
			str = "A";
			break;
		case 11:
			str = "J";
			break;
		case 12:
			str = "Q";
			break;
		case 13:
			str = "K";
			break;
		default:
			str = "" + card;
			
		}
		//���ʂ̕\��
		System.out.println("\n�J�[�h��," + str + "�ł��B");
	}
}
