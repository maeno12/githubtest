/*
 * for���̒���if�����g���i����\���̃l�X�g�j
 * �쐬�FM.Takahashi
 */
class Sample1501 {
	public static void main(String[] args) {
		/*
		 *  0 �` 9 �܂ŏ��ɕ\���B
		 *	3�̔{���̎��ɂ�"(3�̔{��)"�ƕt������B
		 */
		for (int i = 0; i < 10; i++) {
			if ((i % 3) == 0) 	{//i % 3) == 0��3�Ŋ����ė]�肪0�̏ꍇ
				System.out.println(i + "(3�̔{��)");	//�]�肪0�̏ꍇ�͂������\��
			} else {
				System.out.println(i);
			}
		} 
	}
}
