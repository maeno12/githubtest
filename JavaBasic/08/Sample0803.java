/*
 * String型の型変換サンプル
 * 作成：M.Takahashi
 */
class Sample0803 {
	public static void main(String[] args) {
		// 文字列⇒int型
		System.out.print("int型の値を入力してください > ");
		String a = new java.util.Scanner(System.in).nextLine();
		int b = Integer.parseInt(a);

		// 文字列⇒double型
		System.out.print("double型の値を入力してください > ");
		String c = new java.util.Scanner(System.in).nextLine();
		double d = Double.parseDouble(c);

		// 掛け算の結果の表示
		System.out.println("\n("+ b + "×" + d + ")の結果は\t" + b * d);

		// 数値(int・double)⇒文字列の変換
		String bStr = String.valueOf(b);
		String dStr = String.valueOf(d);
		System.out.println("\n文字列変換・連結後\t"+ bStr + dStr);
	}
}
