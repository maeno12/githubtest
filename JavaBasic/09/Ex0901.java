/* ���K09-01
 *�쐬�FA.sato 
 * */

class Ex0901{
	public static void  main(String[] args){
	//��������L�q
		//�E���Ȗ���\���v�f���Q�̔z��subName(String)�^��錾���ėv�f��"A����""�ŏ���������
		//�z��
		String[] subName = {"A����","B����"}; //�^�錾�A�ϐ��� �� ������{}  //���Ȗ�
		//�E���_��\���v�f���Q�̔z��subScore(int�^)��錾����
		int[] subScore = new int[2];      //�^�錾�A�ϐ��� ��new �^[]���z�� //�_��
		//�ϐ�
		String input; //1�s���͗p
		//�E�L�[�{�[�h�����s�̓��͂��󂯕t���Aint�^�ɕϊ���subScore�̃C���f�b�N�X�O�̗v�f����
		System.out.println();
		System.out.print(subName[0] + "�̓_������͂��Ă���������");
		input = new java.util.Scanner(System.in).nextLine();
		subScore[0] = Integer.parseInt(input);
		
		//�E�L�[�{�[�h�����s�̓��͂��󂯕t���Aint�ɕϊ����AsubScore�̃C���f�b�N�X�P�̗v�f�����B
		System.out.println();
		System.out.print(subName[1] + "�̓_������͂��Ă���������");
		input = new java.util.Scanner(System.in).nextLine();
		subScore[1] = Integer.parseInt(input); 
		
		//�E�z��subName�A�z��subScore���Q�Ƃ��Ċe���Ȃ̓��_�ƕ��ϓ_���ȉ��̂悤�ɕ\�����܂��B
		
		//A���ȁF(���͂����l)�_
		//B���ȁF(���͂����l)�_
		//�[�[�[�[
		////���ρF(�v�Z����)�_
		System.out.println();
		System.out.println(subName[0] + ":" + subScore[0] + "�_");
		System.out.println(subName[1] + ":" + subScore[1] + "�_");
		System.out.println("-------");
		System.out.println("����:" + ((subScore[0] + subScore[1]) / 2.0) + "�_");
	}
	
}
