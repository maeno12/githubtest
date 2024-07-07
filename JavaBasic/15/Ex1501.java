class Ex1501 {
	public static void main(String[] args) {
		//変数の宣言
		String input;   //文字入力列
		int total = 0;  //合計
		//「入力した数値を足し算していきます。」と表示します。
		//do-whileループに入ります。
		System.out.println("\n入力した数値を足し算して行きます。\n");
		do {
		//入力を受け付ける
		//キーボードから数値または”exit”という文字列を受け付け。
		//”exit”以外の場合、入力された数値を足して行きます。
			System.out.println("足し算する整数 or exit (終了)>");
			input = new java.util.Scanner(System.in).nextLine();
			if (!input.equals("exit")){
				total += Integer.parseInt(input);
			}
		} while (!input.equals("exit"));
		//”exit”が入力されたら。do-while文を抜け、合計を表示します。
		System.out.println("---");
		System.out.println("合計：" + total);
		
	}
}