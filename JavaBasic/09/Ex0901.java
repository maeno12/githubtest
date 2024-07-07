/* 演習09-01
 *作成：A.sato 
 * */

class Ex0901{
	public static void  main(String[] args){
	//ここから記述
		//・教科名を表す要素数２の配列subName(String)型を宣言して要素を"A教科""で初期化する
		//配列
		String[] subName = {"A教科","B教科"}; //型宣言、変数名 ＝ 初期化{}  //教科名
		//・得点を表す要素数２の配列subScore(int型)を宣言する
		int[] subScore = new int[2];      //型宣言、変数名 ＝new 型[]←配列数 //点数
		//変数
		String input; //1行入力用
		//・キーボードから一行の入力を受け付け、int型に変換しsubScoreのインデックス０の要素を代入
		System.out.println();
		System.out.print(subName[0] + "の点数を入力してください＞");
		input = new java.util.Scanner(System.in).nextLine();
		subScore[0] = Integer.parseInt(input);
		
		//・キーボードから一行の入力を受け付け、intに変換し、subScoreのインデックス１の要素を代入。
		System.out.println();
		System.out.print(subName[1] + "の点数を入力してください＞");
		input = new java.util.Scanner(System.in).nextLine();
		subScore[1] = Integer.parseInt(input); 
		
		//・配列subName、配列subScoreを参照して各教科の得点と平均点を以下のように表示します。
		
		//A教科：(入力した値)点
		//B教科：(入力した値)点
		//ーーーー
		////平均：(計算結果)点
		System.out.println();
		System.out.println(subName[0] + ":" + subScore[0] + "点");
		System.out.println(subName[1] + ":" + subScore[1] + "点");
		System.out.println("-------");
		System.out.println("平均:" + ((subScore[0] + subScore[1]) / 2.0) + "点");
	}
	
}
