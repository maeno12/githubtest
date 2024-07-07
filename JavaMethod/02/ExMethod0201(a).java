/*
 * メソッド演習02-01
 * 作成：M.Takahashi
 */
class ExMethod0201 {
	/*
	課題になっている3つのメソッドとmainメソッドがある。
	 * メインメソッド（整数２つを足し算して表示する）
	 */
	public static void main(String[] args) {
		int first = inputInt();				// 整数入力//inputIntの中身を受け取ってfirstに代入
		int second = inputInt();			// 整数入力//inputIntの中身を受け取ってsecondに代入
		displayAddResult(first, second);	// ２つの数・合計表示←displayAddResult(first, second)を呼び出しす引数は、firstとsecondで、このメソッドは戻り値がないので呼び出すだけ
	}
	/*
	 * 一行入力を受け付けて整数に変換する
	 * 引数：	なし
	 * 戻り値：	入力された整数値
	 */
	static int inputInt() {
		System.out.print("整数を入力してください > ");
		String str = new java.util.Scanner(System.in).nextLine();//結果をString型のstrに代入
		int val = Integer.parseInt(str);//strをint型に変換//int型変数valに代入valueの略

		return val;
	}
	/*
	 * ２つの数を表示し、合計を表示する
	 * 引数：	num1 ... １番目の整数
	 *			num2 ... ２番めの整数
	 * 戻り値：	なし←voidを指定
	 */
	static void displayAddResult(int num1, int num2) {//仮引数として2つ受け取るint num1, int num2
		displayDelimiter();						// 区切り線
		System.out.println("数値１：" + num1);
		System.out.println("数値２：" + num2);
		displayDelimiter();						// 区切り線
		System.out.println("合計：" + (num1 + num2));
		displayDelimiter();						// 区切り線
	}
	/*
	 * 区切り線を表示する
	 * 引数：	なし
	 * 戻り値：	なし←voidを指定
	 */
	static void displayDelimiter() {//引数なしなので何も書かない丸括弧自体は省略できない
		System.out.println("----------------");
	}
}
