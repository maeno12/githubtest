/*
 * ���\�b�h �T���v���P
 * �쐬�FM.Takahashi
 */
class Method0101 {
	/* �Q�悷�郁�\�b�h
	���\�b�h�̋L�q�֌W�͂ǂ���ł����v
	 * �����F	value ...�Q�悷��l
	 * �߂�l�F	�Q�悵������
	 */
	static/*(�����Ɏg�����Ƃ��ł���)*/ int square(int value/*������*/) {//int value��3�ɂȂ�

		int result = value * value;

		return result;
	}	/*
	 * ���C�����\�b�h�F�Q�悵�����ʂ�\������
	java�̏ꍇ�ɂ́A�N���X�̃u���b�N�̊O���ɂ̓��\�b�h���`�ł��܂���B 
	 */
	public static void main(String[] args) {

		// ���\�b�h�Ăяo��
		int valSquared = square(3); //square(3)�̕������A���\�b�h�̌Ăяo����24�s�ڂɔ�� (3)���������̌^�Ɠ����łȂ���΂Ȃ�Ȃ��B��int value/*������*/

		// �\��
		System.out.println("3 �� 2��� " + valSquared);
	}
}
	/*�N���X�̊O�ɋL�q�����ꍇ
	Method0101.java:24: �G���[: class, interface, enum�܂���record������܂���
        static(�����Ɏg�����Ƃ��ł���) int square(int value������) {//int value��3�ɂȂ�
                                ^
Method0101.java:28: �G���[: class, interface, enum�܂���record������܂���
                return result;
                ^
Method0101.java:29: �G���[: class, interface, enum�܂���record������܂���
        }
        ^
�G���[3��
*/
	 

