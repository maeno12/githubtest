/*
 * メソッド サンプル（参照型の引数）
 * 作成：M.Takahashi
 */
class Method0402 {
	/* 参照型を引数として渡すテスト */
	public static void main(String[] args) {
		int[] a = {10, 3, 6};						// a の宣言・初期化

		for (int i = 0; i < a.length; i++) {		// a の要素の表示
			System.out.print(a[i] + " ");
		}
		System.out.println("：(a[]) in main\n");

		displayArrayPlusOne(a);						// メソッド呼び出し

		for (int i = 0; i < a.length; i++) {		// a の要素の表示
			System.out.print(a[i] + " ");
		}
		System.out.println("：(a[]) in main\n");
	}
	/*
	 * 引数の配列要素に１を足して表示する
	 * array：int型配列
	 * 戻り値：なし
	 */
	static void displayArrayPlusOne(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(++array[i] + " ");
		}
		System.out.println("：(array[]) in displayArrayPlusOne\n");
	}
}
