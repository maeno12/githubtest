class Ex1201{
	public static void main(String[] args){
		//1~13のいずれかを入力してください＞と表示し
		System.out.print("\n1~13のいずれかを入力してください＞");
		String input = new java.util.Scanner(System.in).nextLine();
		int card = Integer.parseInt(input);
		//入力を受け入れint型変数に代入し
		//値に応じたトランプの種類を表示してください。
		//表示する文字列の設定
		String str;
		switch (card) {
		case 1:
			str = "A";
			break;
		case 11:
			str = "J";
			break;
		case 12:
			str = "Q";
			break;
		case 13:
			str = "K";
			break;
		default:
			str = "" + card;
			
		}
		//結果の表示
		System.out.println("\nカードは," + str + "です。");
	}
}
