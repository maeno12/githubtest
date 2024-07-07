class Ex1801 {
	public static void main(String[] args) {
		//¤•i–¼E“X•Ü–¼E‹àŠz‚Ì”z—ñ‚ğéŒ¾‚µˆÈ‰º‚Ì‚æ‚¤‚É‰Šú‰»‚µ‚Ü‚·B
		//[¤•i–¼]
		//hƒ{[ƒ‹ƒyƒ“hAhƒm[ƒghAh•tâ³†hAhƒe[ƒvhAhƒzƒbƒ`ƒLƒXh
		String item[] = {   //¤•i–¼
			"ƒ{[ƒ‹ƒyƒ“","ƒm[ƒg","•tâ³†","ƒe[ƒv","ƒzƒbƒ`ƒLƒX"
		};
		//[“X•Ü–¼]
		//hA“X•ÜhAhB“X•ÜhAhC“X•Üh
		String shop[] = {   //“X•Ü–¼
			"A“X•Ü","B“X•Ü","C“X•Ü"
		};
		//[‹àŠz]
	    //o‚X‚OC‚W‚OC‚X‚WC‚X‚TD‚W‚Vp
	    //o‚P‚P‚OC‚P‚Q‚OC‚P‚R‚OC‚P‚S‚OA‚P‚T‚Op
	    //o‚Q‚P‚OC‚Q‚Q‚OC‚Q‚R‚OC‚Q‚S‚OD‚Q‚T‚Op
		int price[] [] =  {           //‹àŠz
			{90,80,98,95,87},
			{110,120,130,140,150},
			{210,220,230,240,250}
		};
		//ŒJ‚è•Ô‚µ(for - ”z—ñ)
		System.out.println("-------");
		for (int i = 0; i < price.length; i++) {
			System.out.println("["+ shop[i] + "]");
			for (int j = 0; j < price[i].length; j++){
				System.out.println(
					item[j] + ":" + price[i][j] + "‰~"
				);
			}
			System.out.println("----------");
		}
		
		
	}
}