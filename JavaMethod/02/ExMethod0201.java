class ExMethod0201{
	public static void main(String[] args){
		
		int first = inputInt();				// 整数入力
		int second = inputInt();			// 整数入力
		displayAddResult(first, second);	// ２つの数・合計表示
		/*int result = inputInt();	変数を初期化できてない*/

		//System.out.println("合計:" + result);
	}
	static void displayAddResult(int num1, int num2) { 
		displayDelimiter();
		System.out.println("数値1:"+num1);
		System.out.println("数値2:"+num2);
		displayDelimiter();
		System.out.println("合計:"+ (num1+ num2));//(num1+ num2)←括弧を付けると文字列連結するため足し算ではなくなる。
		displayDelimiter();
		//表示するだけで戻り値がないためreturnを省略
	}

	/*
	区切り線の表示線を表示するメソッド
	 * 区切り線を表示する
	 * 引数：	なし
	 * 戻り値：	なし
	 */
	static void  displayDelimiter() {  //()とvoidは戻り値なし　戻り値がなくても()は書く
		System.out.println("----------------");
		//戻り値がないためreturnを省略
	}
		static int inputInt() {
			System.out.println("整数を入力してください>");
			String str = new java.util.Scanner(System.in).nextLine();
			int val = Integer.parseInt(str);
			
			return val;//←何に戻しているのか？
			/*
			System.out.println("整数を入力してください>");
			String input2 = new java.util.Scanner(System.in).nextLine();
			int num2 = Integer.parseInt(input2);
			return num1 + num2;
			*/
		}
	}
