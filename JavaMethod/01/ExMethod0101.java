class ExMethod0101 {//クラス名は:class ~~~.java
	public static void main(String[] args) {
	/*以下の仕様のメソッドを定義します。
	●メソッド仕様
		・メソッド名:getCircleArea
		・処理概要：円の面積を求めて結果を返す(円周率は3.14とする)
		・引数:半径(double型)
		・戻り値:円の面積(double型)
	*/// メソッド呼び出し
		double getCircleArea = area(3.0);  //areaの値も気になる//結果を求めているので変数はdoubleでareaの部分でgetCircleAreaを指定↓20行目に飛ぶ

		// 表示
		System.out.println("円の面積は" + getCircleArea);//resultにする必要があるよ！
	}
	/*
	 * ２乗するメソッド
	 * 引数：	value ...２乗する値
	 * 戻り値：	２乗した結果
	 */
	static double area(double value) {   //valueがいまいちわかってない←valueではなく仮引数は求めたいものなので、今回は半径を求めたいので、radius（半径）という英語を設定

		double result = value * value * 3.14;//←valueのところを仮引数のradiusにする必要がある。

		return result;//result←10行目にresultと書いて戻す必要がある。
		}
}
