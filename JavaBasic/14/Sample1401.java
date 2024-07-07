/*
 * for サンプル
 * 作成：M.Takahashi
 */
class Sample1401 {
	public static void main(String[] args) {
		/*
		 *  0 ～ 9 まで順に表示して、最後にその合計を表示する
		 */
		// 合計値の初期化
		int total = 0;//totalはメインメソッドのブロックの中で宣言

		// for ループ
		int i;//forの中にあったiをmainメソッドの中に入れることによって、for文を抜けても使うことができる
		for (/*int*/ i = 0; i < 10; i++) { //int i = 0;初期化式がint i= 0;　０～９までのループするカウンタの初期化
			System.out.println("i=" + i);//"i=" + iは文字列連結//iはforループの中でしか使うことができない
			total += i;
		} 

		// 合計の表示
		System.out.println("----");
		System.out.println("forを抜けた時のi=" + i); //シンボルを見つけられません主な原因①宣言を忘れている②スペルミス③スコープ外で使おうとしている
		System.out.println("----");
		System.out.println("合計：" + total);
	}
}
