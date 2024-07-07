/*
 * メソッド演習01-01
 * 作成：M.Takahashi
 */
class ExMethod0101 {
	/*
	 * メインメソッド（円の面積を表示する）
	 */
	public static void main(String[] args) {

		// メソッド呼び出し
		double result = getCircleArea(3.0);//実引数3.0の値がメソッドの仮引数radiusに設定されてgetCircleAreaの先頭に実行位置が移る↓23行目に飛ぶ

		// 結果表示
		System.out.println("面積：" + result);
	}

	/*
	 * 円の面積を計算して返す
	 * radius：半径
	 * 戻り値：円の面積
	 */
	static/*すぐに使えるメソッド*/ double/*戻り値はdouble型*/ getCircleArea(double/*型*/ radius/*引数名*/) {//12行目と同じ変数、半径を表しているので、英語の半径を表すradiusを仮変数名に使用

		double result = radius * radius * 3.14;

		return result;/*計算結果のresultを戻り値としてreturnしている*/
	}
}
