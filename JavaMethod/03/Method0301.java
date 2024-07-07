/*
 * メソッド サンプル（配列の受け渡し）
 * 作成：M.Takahashi
 */
class Method0301 {
	/*
	２つのメソッドが存在するmainとgetIntArrayメソッド
	 * double型 配列を int型配列に変換して表示
	 */
	public static void main(String[] args) {
		// double型 配列の宣言・初期化
		double[] arrayDouble/*25行目の仮引数と同じ形*/= {10.3, 20.9, 35.7};
		// int型 配列の取得
		int[] arrayInt = getIntArray(arrayDouble);/*←25行目と同じ変数名*///メソッドを呼び出す時の実引数は11行目で初期化したdouble型配列arrayDouble//int[] arrayIntは配列名
		// 結果表示
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
	}
	/*
	 * double 配列を int型配列 に変換
	 * 引数：	arrayDouble ... double型配列
	 * 戻り値：	int型配列
	 */
	static int[]/*戻り値はint型配列*/ getIntArray(double[] arrayDouble) {/*仮引数はdouble型配列のarrayDouble*/
		// 結果配列の宣言・要素の領域確保
		int[] result = new int[arrayDouble.length];//このarrayDouble.lengthは、受け取ったdouble型配列の要素数と同じ要素数文を確保数する←配列の回数だけ計算するの数字が増えたとしてもここをいじる必要はない。
		// 結果配列への値の設定
		for (int i = 0; i < arrayDouble.length; i++) {
			result[i] = (int) arrayDouble[i];
		}
		return result;		// 結果を戻す
	}
}
