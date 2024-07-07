/*
 * 論理演算子のサンプル
 * 作成：M.Takahashi
 */
class Sample0705 {
	public static void main(String[] args) {
		// 変数宣言・初期化
		//ある教科のスコアを初期化
		int aScore = 85;
		int bScore = 78;
		
		//【&&】
		boolean result1 = (aScore >= 80) && (bScore >= 80);//両辺がtrueの時にtrue
		System.out.println("result1：" + result1);

		//【||】
		boolean result2 = (aScore >= 80) || (bScore >= 80);//どちらか一方がtrueであれば、true
		System.out.println("result2：" + result2);
		
		//【!】
		boolean result3 = !(aScore >= 80);//aScoreが80以下だよねと聞いているので、８０以上だからfalse
		System.out.println("result3：" + result3);
	}
}
