/*
 * �z��T���v��
 * �쐬�FM.Takahashi
 */
class Sample0901 {
	public static void main(String[] args) {
		// ���i���z��
		String[] item = new String[3];//�z��̏������Ƒ���𗼕�����Ă���B//�^[] (�z���\������) �ϐ��� �� new �^[]���z��̗v�f��
		item[0] = "�{�[���y��";//9����11�s�ڂŊe�v�f�ɑ��
		item[1] = "�m�[�g";
		item[2] = "�tⳎ�";

//		String[] item = {"�{�[���y��", "�m�[�g", "�tⳎ�"};8�s�ڂ���11�s�ڂ��ȗ��� �^[](�z���\������) �ϐ��� = {,,}�z��̒��g���L�q�@�����͂��̂܂܁A�������""���L�q

		// ���i�z��
		int[] price = { 75, 80, 95 };//�z��̐錾�i�v�f�̏����Ə������𓯎��ɍs���j��13�s�ڂƓ���������

		// �\��
		System.out.println(item[0] + "�F" + price[0] + "�~");//�{�[���y���ƒl�i
		System.out.println(item[1] + "�F" + price[1] + "�~");//�m�[�g�ƒl�i
		System.out.println(item[2] + "�F" + price[2] + "�~");//�tⳎ��ƒl�i
//		System.out.println(item[3] + "�F" + price[3] + "�~"); ArrayIndexOutOfBounds(Excepction(��F��O))�Ŕz��Ŕ͈͊O
		System.out.println("----");//��؂����\��
		System.out.println("���i���F" + item.length);//�z��̗v�f����\���iitem.length�j
	}
}
