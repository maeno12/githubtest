class ExMethod0201{
	public static void main(String[] args){
		
		int first = inputInt();				// ��������
		int second = inputInt();			// ��������
		displayAddResult(first, second);	// �Q�̐��E���v�\��
		/*int result = inputInt();	�ϐ����������ł��ĂȂ�*/

		//System.out.println("���v:" + result);
	}
	static void displayAddResult(int num1, int num2) { 
		displayDelimiter();
		System.out.println("���l1:"+num1);
		System.out.println("���l2:"+num2);
		displayDelimiter();
		System.out.println("���v:"+ (num1+ num2));//(num1+ num2)�����ʂ�t����ƕ�����A�����邽�ߑ����Z�ł͂Ȃ��Ȃ�B
		displayDelimiter();
		//�\�����邾���Ŗ߂�l���Ȃ�����return���ȗ�
	}

	/*
	��؂���̕\������\�����郁�\�b�h
	 * ��؂����\������
	 * �����F	�Ȃ�
	 * �߂�l�F	�Ȃ�
	 */
	static void  displayDelimiter() {  //()��void�͖߂�l�Ȃ��@�߂�l���Ȃ��Ă�()�͏���
		System.out.println("----------------");
		//�߂�l���Ȃ�����return���ȗ�
	}
		static int inputInt() {
			System.out.println("��������͂��Ă�������>");
			String str = new java.util.Scanner(System.in).nextLine();
			int val = Integer.parseInt(str);
			
			return val;//�����ɖ߂��Ă���̂��H
			/*
			System.out.println("��������͂��Ă�������>");
			String input2 = new java.util.Scanner(System.in).nextLine();
			int num2 = Integer.parseInt(input2);
			return num1 + num2;
			*/
		}
	}
