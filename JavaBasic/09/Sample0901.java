/*
 * 配列サンプル
 * 作成：M.Takahashi
 */
class Sample0901 {
	public static void main(String[] args) {
		// 商品名配列
		String[] item = new String[3];//配列の初期化と代入を両方やっている。//型[] (配列を表す括弧) 変数名 ＝ new 型[]←配列の要素数
		item[0] = "ボールペン";//9から11行目で各要素に代入
		item[1] = "ノート";
		item[2] = "付箋紙";

//		String[] item = {"ボールペン", "ノート", "付箋紙"};8行目から11行目を簡略化 型[](配列を表す括弧) 変数名 = {,,}配列の中身を記述　数字はそのまま、文字列は""を記述

		// 価格配列
		int[] price = { 75, 80, 95 };//配列の宣言（要素の準備と初期化を同時に行う）←13行目と同じ書き方

		// 表示
		System.out.println(item[0] + "：" + price[0] + "円");//ボールペンと値段
		System.out.println(item[1] + "：" + price[1] + "円");//ノートと値段
		System.out.println(item[2] + "：" + price[2] + "円");//付箋紙と値段
//		System.out.println(item[3] + "：" + price[3] + "円"); ArrayIndexOutOfBounds(Excepction(約：例外))で配列で範囲外
		System.out.println("----");//区切り線を表示
		System.out.println("商品数：" + item.length);//配列の要素数を表示（item.length）
	}
}
