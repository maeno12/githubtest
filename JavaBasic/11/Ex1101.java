class Ex1101{
	public static void main(String[] args){
		//・キーボードからテストの点数を受け付け、int型に変換しint型変数に代入します。
		//・６０点未満の場合には、キーボードから補修受講の有無を"yes"/"no"で受け付け、String型変数に代入しますl。
		//[評価]
		//８０点以上・・A評価
		//６０点以上８０点未満・・B評価
		//６０点未満・・C評価(補習を受けた）
		//　　　　・・・D評価（補習を受けていない)
		
		//変数宣言
		String result;  //評価結果
		int score;      //点数
		String addStudy = null; //補習を受けた("yes"/"no")
		
		//点数入力
		System.out.println("\n点数を入力してください＞");
		String str = new java.util.Scanner(System.in).nextLine();
		score = Integer.parseInt(str);
		
		//60点未満の時に補習の有無を聞く
		if (score < 60) {
		    System.out.println("\n補習を受けましたか？(yes/no) >");
			addStudy = new java.util.Scanner(System.in).nextLine();
		}
		//判定
		if (80 <= score) {
			result = "A評価";
		} else if (60 <= score){
		    result = "B評価";
		} else if (addStudy.equals("yes")) {
			result = "C評価";
		} else {
			result = "D評価";
		//結果の表示
			System.out.println("\n結果：" + result);
		}
	}
}