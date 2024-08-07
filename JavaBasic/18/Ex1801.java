class Ex1801 {
	public static void main(String[] args) {
		//商品名・店舗名・金額の配列を宣言し以下のように初期化します。
		//[商品名]
		//”ボールペン”、”ノート”、”付箋紙”、”テープ”、”ホッチキス”
		String item[] = {   //商品名
			"ボールペン","ノート","付箋紙","テープ","ホッチキス"
		};
		//[店舗名]
		//”A店舗”、”B店舗”、”C店舗”
		String shop[] = {   //店舗名
			"A店舗","B店舗","C店舗"
		};
		//[金額]
	    //｛９０，８０，９８，９５．８７｝
	    //｛１１０，１２０，１３０，１４０、１５０｝
	    //｛２１０，２２０，２３０，２４０．２５０｝
		int price[] [] =  {           //金額
			{90,80,98,95,87},
			{110,120,130,140,150},
			{210,220,230,240,250}
		};
		//繰り返し(for - 配列)
		System.out.println("-------");
		for (int i = 0; i < price.length; i++) {
			System.out.println("["+ shop[i] + "]");
			for (int j = 0; j < price[i].length; j++){
				System.out.println(
					item[j] + ":" + price[i][j] + "円"
				);
			}
			System.out.println("----------");
		}
		
		
	}
}