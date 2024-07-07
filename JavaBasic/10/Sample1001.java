/*
 * if - else サンプル（関係演算子）
 * 作成：M.Takahashi
 */
class Sample1001 {
	public static void main(String[] args) {
		// 料金
		int result;

		// 年齢入力
		System.out.print("\n年齢を入力してください > ");
		String str = new java.util.Scanner(System.in).nextLine(); //strに代入String型
		int age = Integer.parseInt(str); //String型をint型に型変換

		//十二歳以上は2000円で以下は千円
		// 料金の設定（条件分岐）
		//必ずどちらか一方が実行される
		if (age >= 12) {
			result = 2000;
		} else {
			result = 1000;
		}

		// 料金の表示
		System.out.println("\n料金：" + result + "円");
	}
}
