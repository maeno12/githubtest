/*
 * 演算子ごとの優先順位・結合法則
 * 作成：M.Takahashi
 */
class Sample0707 {
	public static void main(String[] args) {
		// 変数宣言・初期化
		int a = 5;
		int b = 2;
		int c = 2;
		int d = 3;
		int e = 3;

		// 優先順位
		boolean result1 = a + b * c == d * e;
		System.out.println("result1：" + result1);

		boolean result2 = ((a + (b * c)) == (d * e));//１５行目と同じ問題でかっこを付けてわかりやすく
		System.out.println("result2：" + result2);

		// 結合法則
		int result3 = a * b % d;//左から計算
		System.out.println("result3：" + result3);

		int result4 = a;
		int result5 = result4 += b;//＝と＋＝は同じで、結合規則は右から左　まずresult4+bが計算されて、それが、result5に代入される
//		int result4 += b; // 26行目を2行で表してわかりやすく表示
//		int result5 = result4; //
		System.out.println("result4：" + result4);
		System.out.println("result5：" + result5);
	}
}
