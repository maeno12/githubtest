/*
 * メソッド サンプル１
 * 作成：M.Takahashi
 */
class Method0101 {
	/* ２乗するメソッド
	メソッドの記述関係はどちらでも大丈夫
	 * 引数：	value ...２乗する値
	 * 戻り値：	２乗した結果
	 */
	static/*(すぐに使うことができる)*/ int square(int value/*仮引数*/) {//int valueが3になる

		int result = value * value;

		return result;
	}	/*
	 * メインメソッド：２乗した結果を表示する
	javaの場合には、クラスのブロックの外側にはメソッドを定義できません。 
	 */
	public static void main(String[] args) {

		// メソッド呼び出し
		int valSquared = square(3); //square(3)の部分が、メソッドの呼び出し→24行目に飛ぶ (3)←仮引数の型と同じでなければならない。例int value/*仮引数*/

		// 表示
		System.out.println("3 の 2乗は " + valSquared);
	}
}
	/*クラスの外に記述した場合
	Method0101.java:24: エラー: class, interface, enumまたはrecordがありません
        static(すぐに使うことができる) int square(int value仮引数) {//int valueが3になる
                                ^
Method0101.java:28: エラー: class, interface, enumまたはrecordがありません
                return result;
                ^
Method0101.java:29: エラー: class, interface, enumまたはrecordがありません
        }
        ^
エラー3個
*/
	 

