/*
 * for �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1401 {
	public static void main(String[] args) {
		/*
		 *  0 �` 9 �܂ŏ��ɕ\�����āA�Ō�ɂ��̍��v��\������
		 */
		// ���v�l�̏�����
		int total = 0;//total�̓��C�����\�b�h�̃u���b�N�̒��Ő錾

		// for ���[�v
		int i;//for�̒��ɂ�����i��main���\�b�h�̒��ɓ���邱�Ƃɂ���āAfor���𔲂��Ă��g�����Ƃ��ł���
		for (/*int*/ i = 0; i < 10; i++) { //int i = 0;����������int i= 0;�@�O�`�X�܂ł̃��[�v����J�E���^�̏�����
			System.out.println("i=" + i);//"i=" + i�͕�����A��//i��for���[�v�̒��ł����g�����Ƃ��ł��Ȃ�
			total += i;
		} 

		// ���v�̕\��
		System.out.println("----");
		System.out.println("for�𔲂�������i=" + i); //�V���{�����������܂����Ȍ����@�錾��Y��Ă���A�X�y���~�X�B�X�R�[�v�O�Ŏg�����Ƃ��Ă���
		System.out.println("----");
		System.out.println("���v�F" + total);
	}
}
