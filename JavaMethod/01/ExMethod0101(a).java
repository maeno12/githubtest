/*
 * ���\�b�h���K01-01
 * �쐬�FM.Takahashi
 */
class ExMethod0101 {
	/*
	 * ���C�����\�b�h�i�~�̖ʐς�\������j
	 */
	public static void main(String[] args) {

		// ���\�b�h�Ăяo��
		double result = getCircleArea(3.0);//������3.0�̒l�����\�b�h�̉�����radius�ɐݒ肳���getCircleArea�̐擪�Ɏ��s�ʒu���ڂ遫23�s�ڂɔ��

		// ���ʕ\��
		System.out.println("�ʐρF" + result);
	}

	/*
	 * �~�̖ʐς��v�Z���ĕԂ�
	 * radius�F���a
	 * �߂�l�F�~�̖ʐ�
	 */
	static/*�����Ɏg���郁�\�b�h*/ double/*�߂�l��double�^*/ getCircleArea(double/*�^*/ radius/*������*/) {//12�s�ڂƓ����ϐ��A���a��\���Ă���̂ŁA�p��̔��a��\��radius�����ϐ����Ɏg�p

		double result = radius * radius * 3.14;

		return result;/*�v�Z���ʂ�result��߂�l�Ƃ���return���Ă���*/
	}
}
