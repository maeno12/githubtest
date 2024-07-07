/*
 * メソッド サンプル１
 * 作成：M.Takahashi
 */
class Method0101 {
	/*
	 * メインメソッド：２乗した結果を表示する
	 */
	public static void main(String[] args) {

		// メソッド呼び出し
		int valSquared = square(3);

		// 表示
		System.out.println("3 の 2乗は " + valSquared);
	}

	/*
	 * ２乗するメソッド
	 * 引数：	value ...２乗する値
	 * 戻り値：	２乗した結果
	 */
	static int square(int value) {

		int result = value * value;

		return result;
	}
}
