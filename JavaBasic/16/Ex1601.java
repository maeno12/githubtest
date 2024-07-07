class Ex1601 {
	public static void main(String[] args) {
		//商品の配列から（要素数５）を宣言して、以下の文字列を初期化します。ボールペン、ノート、付箋紙、テープ、ホッチキス
		//金額の配列（要素数５）を宣言して、以下の金額で初期化します。９０，８０，１１０，９５，２０
		//商品の名前と金額
		String item[] = {
		"ボールペン","ノート","付箋紙","テープ","ホッチキス"
	};
	int  price[] = {90, 80, 110, 95, 200};//，にする
		
		//各商品に対して「商品名：金額」の形式を表示し、金額が１００以上の商品に（＊）をつけて表示してください。
		//繰り返し(for - 配列)
		System.out.println();
		for (int i = 0; i < item.length; i++) {
			String str = item[i] + ":" + price[i] + "円";
			if (100 <= price[i]) {
				str  += "(*)";
		   }
			System.out.println(str);
		}
	}
}
