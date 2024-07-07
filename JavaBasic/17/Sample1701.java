/*
 * break サンプル
 * 作成：M.Takahashi
 */
class Sample1701 {
	public static void main(String[] args) {
		/*
		 * 配列の要素を表示する。ただし値がマイナスの要素が見つかったら
		 * その要素以降の処理を行わない。
		 */
		// 配列
		int[] array = {10, 0, 5, -1, 9, -2, 3};

		// for ループ
		for (int i = 0; i < array.length; i++) {
			// マイナスの値が見つかったらループを抜ける
			if (array[i] < 0) {   //array[i] < 0 ifの条件式は、配列arrayのi番目の要素が0より小さかったら、breakでforループを抜けます。
				break;
			}
			// 要素の表示
			System.out.println("array["+ i + "]：" + array[i]);
		}
	}
}
