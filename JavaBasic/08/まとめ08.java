[1]代入の原則
	・右辺と左辺のデータ型が同じ。
[2]自動的な型変換
	①代入時
	・左辺の型が大きいときのみ右辺の型を自動的に肩を変換してから代入（一時的に型変換する）
	・型の大小関係
double > float > long > int > short(char) > byte
[2]自動的な型変換
②演算時
	①基本データ型
	・演算の時には、大きな型に揃えられる。
	・優先順位と結合規則に従って段階的に評価される毎に型が決まる。
[2]自動的な型変換
②演算時
	②文字列連結
	・演算子＋は、左辺・右辺のどちらかがString型の時には文字列連結となる。
	・この時、String型でないオペランドは、自動的にString型に変換される。
[3]明示的な型変換
②String型
	①String型→int型の変換
	・Integer.parseInt
	②String型→double型の変換
	・Double.parseDouble
	③数値(int/double)型→String型
	・String.valueOf
	・"" + (数値型)
[4]入出力・エスケープ
①標準入力
	①キーボードからの1行入力
	・str = new java.util.Scanner(System.in).nextLine();
	＊strは取得した文字列を格納するString型の変換。
	②画面への表示
	・System.out.println //改行あり
	・System.out.print//改行なし
[4]入出力・エスケープ
②エスケープシーケンス
	・￥（円マーク）の後に定められた文字を記述することで制御文字などの特別な文字を表現する方法。