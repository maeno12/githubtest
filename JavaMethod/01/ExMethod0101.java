class ExMethod0101 {//�N���X����:class ~~~.java
	public static void main(String[] args) {
	/*�ȉ��̎d�l�̃��\�b�h���`���܂��B
	�����\�b�h�d�l
		�E���\�b�h��:getCircleArea
		�E�����T�v�F�~�̖ʐς����߂Č��ʂ�Ԃ�(�~������3.14�Ƃ���)
		�E����:���a(double�^)
		�E�߂�l:�~�̖ʐ�(double�^)
	*/// ���\�b�h�Ăяo��
		double getCircleArea = area(3.0);  //area�̒l���C�ɂȂ�//���ʂ����߂Ă���̂ŕϐ���double��area�̕�����getCircleArea���w�聫20�s�ڂɔ��

		// �\��
		System.out.println("�~�̖ʐς�" + getCircleArea);//result�ɂ���K�v�������I
	}
	/*
	 * �Q�悷�郁�\�b�h
	 * �����F	value ...�Q�悷��l
	 * �߂�l�F	�Q�悵������
	 */
	static double area(double value) {   //value�����܂����킩���ĂȂ���value�ł͂Ȃ��������͋��߂������̂Ȃ̂ŁA����͔��a�����߂����̂ŁAradius�i���a�j�Ƃ����p���ݒ�

		double result = value * value * 3.14;//��value�̂Ƃ������������radius�ɂ���K�v������B

		return result;//result��10�s�ڂ�result�Ə����Ė߂��K�v������B
		}
}
