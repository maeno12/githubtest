class Ex1701 {
	public static void main(String[] args) {
		//数値が格納された配列の要素を表示します。
		//９９は表示しません。
		//９９が３回連続したら以降を表示しません。
		//例1 int[] arr = {11,12,99,99,15,99,27,28,29,30};
		int[] arr = {11,12,99,99,15,99,27,28,29,30};
		//例2 int[] arr = {11,12,99,99,99,26,27,28,29,30};
		//int[] arr = {11,12,99,99,99,26,27,28,29,30};
		
		int qqCnt = 0; //９９連続カウント用
		
		//順次表示するループ
		System.out.println("---breakを使うパターン---");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=99) {
				//要素が９９以外なら表示して、連続カウントを０に戻す
				System.out.println(arr[i]);
				qqCnt = 0;
			}else {
				//要素が９９なら連続カウントをインクリメントし３回に達したら抜ける
				qqCnt++;
				if (3 <= qqCnt) {
					break;
				}
			}
		}
		/*
		System.out.println("---breakを使わないパターン----");
			for (int i = 0; (i < arr.length) && (qqCnt < 3; i++){
				if (arr[i] ! = 99) {
					//要素が９９以外なら表示して、連続カウントを０に戻す
					System.out.println(arr[i]);
					qqCnt = 0;
				}else {
					//要素が９９なら連続カウントをインクリメント
					qqCnt++;
				
			}
				
		*/
		
	}
}