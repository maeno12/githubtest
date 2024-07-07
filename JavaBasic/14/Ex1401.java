class EX1401 {
	public static void main (String[] args){
		//「3づつ増やして表示します。」
		//ガイドメッセージ表示
		System.out.println("\n3ずつ増やして表示します。");
		//キーボードから最小値を受け付け、int型に変換しint型変数に代入
		System.out.println("\n最小値を入力してください。＞");
		String minStr = new java.util.Scanner(System.in).nextLine();
		int min = Integer.parseInt(minStr);
		//キーボードから最大値を受け付け、int型に変換しint型変換に代入します。
		System.out.println("\n最大値を入力してください。＞");
		String maxStr = new java.util.Scanner(System.in).nextLine();
		int max = Integer.parseInt(maxStr);
		
		System.out.println();   //空行を表示
		//最小値から、３づつ増やして表示していきます。
		//最大値以下である間、表示し続けます。
		//繰り返し(for ループ)
		int count = 0;
		for (int i = min; i <= max; i +=3) {
			System.out.println(i);
			count++;
		}
		//そして、最後に個数を表示します。
		//（例）最小値：１,最大値：１０の場合
		System.out.println("---");
		System.out.println("個数" + count);
		
		
	}
}