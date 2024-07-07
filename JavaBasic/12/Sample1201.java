/*
 * switch サンプル int型
 * 作成：M.Takahashi
 */
class Sample1201 {
	public static void main(String[] args) {
		// 年齢区分入力
		System.out.print("\n12歳以上=1, 6歳以上・12歳未満=2, 6歳未満=3 > ");
		String str = new java.util.Scanner(System.in).nextLine();//代入
		int div = Integer.parseInt(str);//型変換

		// 価格表示
		switch (div) {//入力値をint変換した変数をdivを記述
			case 1:
				System.out.println("\n2000円です。");
				break;
			case 2:
				System.out.println("\n1000円です。");
				break;
			case 3:
				System.out.println("\n0円です。");
				break;
			default:
				System.out.println("\n指定された区分が間違っています。");
		}
/*if文で書いた処理 if文の場合には、"<",">"といった関係演算子や論理演算子などを使って、複雑な条件を書くことができる。
		if (div == 1) {
			System.out.println("\n2000円です。");
		} else if (div == 2) {
			System.out.println("\n1000円です。");
		} else if (div == 3) {
			System.out.println("\n0円です。");
		} else {
			System.out.println("\n指定された区分が間違っています。");
		}
*/
	}
}
