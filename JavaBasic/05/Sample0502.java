/*
 * �ϐ��̃T���v���Q
 * �쐬�FM.Takahashi
 */
class Sample0502 {
	public static void main(String[] args) {

		int age;				// �ϐ��̐錾
		age = 20;				// �ϐ��ւ̒l�̑�� �R�����g�A�E�g����@�P�T�s�ڂŃR���p�C���G���[

		age = 24;				// �㏑���@�R�����g�A�E�g����

		int height = 173;		// �ϐ��̐錾�Ƒ���i�������j

		int thisAge = age;		// �ϐ�����ϐ��֑���@//�R�����g�A�E�g����ƃR���p�C���G���[�@�ϐ�age������������Ă��Ȃ��\��������܂��B
		int nextAge = age + 1;	// �v�Z���ʂ̑��

		// ����������̕\��
		System.out.print("��������F�N��=" + thisAge + "��");
		System.out.print("�E�g��=" + height + "cm");
		System.out.println("�E���N�̔N��=" + nextAge + "��");
	}
}
