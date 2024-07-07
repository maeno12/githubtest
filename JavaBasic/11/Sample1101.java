/*
 * if, if-else if-else, 文字列比較 サンプル
 * 作成：M.Takahashi
 */
class Sample1101 {
	public static void main(String[] args) {
		// 【乗車料金】
		// 6歳未満：		0円
		// 6歳以上12歳未満：1000円
		// 12歳以上：		2000円（通常）
		//					1500円（割引券あり）

		// 変数宣言
		int result;			// 価格
		int age;			// 年齢
		String discTicket = null;	// 割引券 ("yes"/"no")//nullで初期化

		// 年齢入力
		System.out.print("\n年齢を入力してください > ");
		String ageStr = new java.util.Scanner(System.in).nextLine();//文字列を一行入力
		age = Integer.parseInt(ageStr);//文字列をint型に変換

		// 12歳以上の場合のみ処理 (if のみ)//ここは12歳以上の場合だけ、割引券の有無を確認したい
		if (12 <= age) {
			// 割引券の有無の入力
			System.out.print("\n割引券はありますか？ (yes/no) > ");
			discTicket = new java.util.Scanner(System.in).nextLine();//入力された文字列をdiscTicketに代入
		}

		// 価格の決定 (if - else if ・文字列比較）
		if (age < 6) {
			result = 0;
		} else if (age < 12) {
			result = 1000;
		} else if (discTicket.equals("yes")) {//26行目がyesかどうか確認//String型変数.equals(比較対象)
			result = 1500;
		} else {
			result = 2000;
		}

		// 料金の表示
		System.out.println("\n料金：" + result + "円");//if文の結果が代入される
	}
}
