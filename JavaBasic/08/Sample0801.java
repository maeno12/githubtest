/*
 * 自動的な型変換サンプル
 * 作成：M.Takahashi
 */
class Sample0801 {
	public static void main(String[] args) {
		int a = 10;		// int型変数の宣言・初期化

		// 代入時の自動的な型変換
		double b = a;	// double型 <- int型 このときに、右辺の値がint型からdouble型に一時的に型変換されてdouble型になってから左辺のbに代入
		System.out.println("b：" + b);

		// 演算時の自動的な型変換（評価毎に型が決まる）
		double c = 3 / 2 * 2.0;
		System.out.println("c：" + c);

		double d = 3.0 / 2 * 2.0;
		System.out.println("d：" + d);

		// 演算時の自動的な型変換（String型の連結）
		int e = 50;
		int f = 20;
		String g = e + f + "円が合計です。";
		System.out.println("g：" + g);

//		String h = "合計は" + e + f + "円です。";//文字列連結が起こり合計 2050という数字になってしまう。
		String h = "合計は" + ( e + f ) + "円です。";//文字列連結を起こさない先に（）で優先順位を明確化する
		System.out.println("h：" + h);
	}
}
