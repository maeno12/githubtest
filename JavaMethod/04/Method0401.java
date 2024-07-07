/*
 * メソッド サンプル（基本データ型の引数）
 * 作成：M.Takahashi
 */
class Method0401 {
	/* 基本データ型を引数として渡すテスト */
	public static void main(String[] args) {
		int a = 5;									// a の宣言・初期化

		System.out.println(a + "：(a) in main\n");	// a の表示

		displayPlusOne(a);							// メソッド呼び出し

		System.out.println(a + "：(a) in main\n");	// a の表示
	}
	/*
	 * 引数に１を足して表示する
	 * val：整数値
	 * 戻り値：なし
	 */
	static void displayPlusOne(int val) {
		System.out.println(++val + "：(val)in displayPlusOne\n");
	}
}
