/*
 * データ型のサンプル
 * 作成：M.Takahashi
 */
class Sample0601 {
	public static void main(String[] args) {

		int engScore = 78;			// 英語得点　Lを付けるとL型をintに代入しようとしてコンパイルエラー Int←Long
		int mathScore = 64;			// 数学得点
		float value = 58.3F;		// 偏差値Fを付け忘れるとダブルからFに変換しようとするのでコンパイルエラー Float←Double
		char assess = 'Ｂ';			// 評価  //一文字なので、シングルクォーテーション　文字列は""で書く String←Char
		boolean pass = true;		// 合格
		long takerCnt = 12345L;		// 受験者数

		// 試験結果情報の表示
		System.out.println("--------------------");
		System.out.println("【●●さんの結果】");
		System.out.println("英語点数=" + engScore);
		System.out.println("数学点数=" + mathScore);
		System.out.println("偏差値=" + value);　　//書く時にはFをつけるが表示はされない
		System.out.println("評価=" + assess);
		System.out.println("合格=" + pass);
		System.out.println("--------------------");
		System.out.println("受験者数=" + takerCnt);//書く時には数字の後にLを付けるが表示は数字のみ
	}
}
