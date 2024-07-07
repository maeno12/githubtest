/*
 * メソッド サンプル (引数が複数、引数なし）
 * 作成：M.Takahashi
 */
class Method0201 {
	/*
	//3つのメソッドがあるmain　createIntro　getDelimiter
	 * 自己紹介を表示する
	 */
	public static void main(String[] args) {  
		//変数の宣言、初期化を行っている
		String n = "速水剛留";					// 名前
		int a = 24;								// 年齢
		String c = "○○システム";				// 会社名

		String result = createIntro(n, a, c);	// 自己紹介作成  //createIntro(n←変数名12行目, a←変数名13行目, c←変数名14行目)←個々の部分がメソッド呼び出し

		System.out.println(result);				// 結果の表示
	}

	/*
	 * 自己紹介の文字列を作成する
	 * 引数：	name ... 名前
	 * 			age ... 年齢
	 * 			company ... 社名
	 * 戻り値：	自己紹介文字列
	 */
	static String createIntro(String name, int age, String company) {
		String intro = getDelimiter();
//		intro += name + "(" + age + ")\n";
		intro += name + "\n年齢:" + age + "\n";
		intro += company + "\n";
		intro += getDelimiter();

		return intro;  //introを戻り値としてreturnしている。createIntro(n, a, c)に戻している
	}

	/*
	 * 区切り線を返す
	 * 引数：	なし
	 * 戻り値：	区切り線（＋改行）
	 */
	static String getDelimiter() /*仮引数がなくても省略することができない*/{
//		return "----------------\n";  //\n改行
		return "+ + + + +\n";  //\n改行
	}
}
