class Ex1501 {
	public static void main(String[] args) {
		//�ϐ��̐錾
		String input;   //�������͗�
		int total = 0;  //���v
		//�u���͂������l�𑫂��Z���Ă����܂��B�v�ƕ\�����܂��B
		//do-while���[�v�ɓ���܂��B
		System.out.println("\n���͂������l�𑫂��Z���čs���܂��B\n");
		do {
		//���͂��󂯕t����
		//�L�[�{�[�h���琔�l�܂��́hexit�h�Ƃ�����������󂯕t���B
		//�hexit�h�ȊO�̏ꍇ�A���͂��ꂽ���l�𑫂��čs���܂��B
			System.out.println("�����Z���鐮�� or exit (�I��)>");
			input = new java.util.Scanner(System.in).nextLine();
			if (!input.equals("exit")){
				total += Integer.parseInt(input);
			}
		} while (!input.equals("exit"));
		//�hexit�h�����͂��ꂽ��Bdo-while���𔲂��A���v��\�����܂��B
		System.out.println("---");
		System.out.println("���v�F" + total);
		
	}
}