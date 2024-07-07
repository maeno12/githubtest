class Ex1001{
	public static void main(String[] args){
		//結果表示用
		String result;
		//・キーボードから１行の入力を受け付け、int型に変化しint型変数に代入
		//整数入力
		System.out.print("\n整数を入力してください＞");
		String str = new java.util.Scanner(System.in).nextLine();
		int num = Integer.parseInt(str);
		//入力値が１以上１００以下の場合に「…は１～１００の範囲内です。」と表示
			if ((1 <= num) && (num <= 100)) {
				result = "1~100の範囲内です。";
		//・そうでない場合「・・は１～１００の範囲外です。」と表示します。
			} else {
				result = "1~100の範囲外です。";
			}
				System.out.println("\n" + num + "は" + result);
	}
}
