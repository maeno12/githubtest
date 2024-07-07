/*
 * String型の型変換サンプル
 * 作成：M.Takahashi
 */
class Sample0803 {
	public static void main(String[] args) {
		// 文字列⇒int型
		System.out.print("int型の値を入力してください > ");//改行せずに表示
		String a = new java.util.Scanner(System.in).nextLine();//キーボードから入力した1行をString型変数aに代入
		int b = Integer.parseInt(a); //String型からint型に型変換

		// 文字列⇒double型
		System.out.print("double型の値を入力してください > ");
		String c = new java.util.Scanner(System.in).nextLine();//キーボードから入力した1行をString型変数cに代入
		double d = Double.parseDouble(c);//String型からdouble型に型変換

		// 掛け算の結果の表示
		System.out.println("\n("+ b + "×" + d + ")の結果は\t" + b * d);//演算子は+と*のですね。*が優先順位が高いb*dが最初に評価//\nは改行　"+ b + "×" + d + "中身を文字列で表示している。\tはタブ

		// 数値(int・double)⇒文字列の変換
		String bStr = String.valueOf(b);//10行目のint型変数をString型に変換
		String dStr = String.valueOf(d);//15行目のdouble型変数をString型に変換
		System.out.println("\n文字列変換・連結後\t"+ bStr + dStr);//\n改行　\t タブ
	}
}
