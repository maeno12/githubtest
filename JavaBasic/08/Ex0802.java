class Ex0802{
	public static void main(String[] args){
		//1.正の整数の入力を受付へaStrに代入
		System.out.println("正の整数を入力してください");
		String aStr = new java.util.Scanner(System.in).nextLine();
		//aStrをint型に変換しint型変数をaに代入します。
		int a = Integer.parseInt(aStr);
		//正の整数を入力を受付bStrに代入
		System.out.println("正の整数を入力してください");
		String bStr = new java.util.Scanner(System.in).nextLine();
		//bStrをint型に変換しint型変数bに代入
		int b = Integer.parseInt(bStr);
		//割り算をして、以下のように表示してください
		System.out.println("商:"+a/b);
		System.out.println("余り:"+a%b);
	}
}

		