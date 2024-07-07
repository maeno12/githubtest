/*
 * 明示的な型変換サンプル
 * 作成：M.Takahashi
 */
class Sample0802 {
	public static void main(String[] args) {
		// 定数・変数の宣言と初期化
		final double TAX_RATE = 1.08;	// 税率
		int price = 20;					// 定価

		// 掛け算の結果を int型変数に代入
		int result = (int) (price * TAX_RATE);
//		int result = (int) price * TAX_RATE;//キャスト演算子の法が優先順位が高いのコンパイルエラーが起きる
		System.out.println("result：" + result);

		/*		//String型→int型
		String a = "10";
		int b = Intger.parseInt(a);
		//String型→double型
		String c = "12.34";
		double d = Double.parseDouble(c);
		//数値(int/double)型→String型
		int a = 10;
		String aStr = String.valueOf(a);
		③数値(int/double)型→String型（自動的な型変換を活用）
		int a = 10;
		String aStr = "" + a;
*/
	}
}
