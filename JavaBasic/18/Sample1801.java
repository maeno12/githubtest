/*
 * 多重 ループで 多次元配列を扱う サンプル
 * 作成：M.Takahashi
 */
class Sample1801 {
	public static void main(String[] args) {
		/*
		 * 配列に格納された教科名（国語、算数、英語、理科、社会）と
		 * 点数 (各教科の点数) を「教科名：点数」の形式で表示して
		 * その後に個人別の合計と平均を表示する。平均は int 型
		 * 点数配列は２次元配列として
		 * ３人分(河合さん、速水さん、渕矢さん)のデータを保持する。
		 */
		// 配列・変数の宣言・初期化
		String[] sub = {					// 教科名
			"国語", "算数", "英語", "理科", "社会", "情報"
		};
		String[] person = {					// 受講者
			"河合", "速水", "渕矢"
		};
		int[][] score = {					// 点数 //数字は教科の初期化で、｛｝の三つは受講者
			{83, 77, 91, 68, 84},
			{78, 66, 81, 92, 59, 85},
			{94, 81, 79, 86, 79}
		};
		int total;							// 個人別合計

		// 人数分の for ループ
		for (int i = 0; i < score.length; i++) {  //score.lengthは2次元目の要素数(1次元目の配列数)となるので、ここでは３
			total = 0;
			System.out.println("\n--【" + person[i] + "さんの得点】--");//0の時は、河合さん、1の時は速水、2の時は渕矢
			// 教科数分 の for ループ
			for (int j = 0; j < score[i].length; j++) {  //score[i].lengthこの行と41行目は数字が増えても対応できるようになっている。
				System.out.print(				// 教科・点数表示  //22行目から24行目の数字で一人当たり5個
					sub[j] + "：" + score[i][j] + " "//sub 科目ごと、score[0][0]←河合の８３　score[1][0]←速水の７８
				);
				total += score[i][j];			// 合計に加算
			}
			// 合計・平均の表示
			System.out.println("\n合計：" + total);
			System.out.println("平均：" + total / score[i].length);
		}
	}
}
