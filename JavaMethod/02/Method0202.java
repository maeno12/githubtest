/*
 * メソッド サンプル (戻り値なし)
 * 作成：M.Takahashi
 */
class Method0202 {
	/*
	3つのメソッドが存在　displayIntro　main　displayDelimiter
	 * 自己紹介を表示する
	 */
	public static void main(String[] args) {
		String n = "速水剛留";					// 名前
		int a = 24;								// 年齢
		String c = "○○システム";				// 会社名

		  //Method0202.java:15: エラー: 不適合な型: voidをStringに変換できません:
		/*String result = */ displayIntro(n, a, c);					// 自己紹介の表示//25行目の飛ぶ
	}

	/*
	 * 自己紹介の文字列を表示
	 * 引数：	name ... 名前
	 * 			age ... 年齢
	 * 			company ... 社名
	 * 戻り値：	なし
	 */
	static void displayIntro(String name, int age, String company) {  //voidなどで戻り値がないことを確認　displayIntroメソッドは、戻り値がないので、代入や演算などに使用することができず呼び出すのみ
		displayDelimiter();//戻り値がないので、呼び出すだけのメソッド
		System.out.println(name + "(" + age + ")");
		System.out.println(company);
		displayDelimiter();
		//表示するだけで戻り値がないためreturnを省略
	}

	/*
	区切り線の表示線を表示するメソッド
	 * 区切り線を表示する
	 * 引数：	なし
	 * 戻り値：	なし
	 */
	static void displayDelimiter() {  //()とvoidは戻り値なし　戻り値がなくても()は書く
		System.out.println("----------------");
		//戻り値がないためreturnを省略
	}
}
