class Ex0802{
	public static void main(String[] args){
		//1.³‚Ì®”‚Ì“ü—Í‚ğó•t‚ÖaStr‚É‘ã“ü
		System.out.println("³‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String aStr = new java.util.Scanner(System.in).nextLine();
		//aStr‚ğintŒ^‚É•ÏŠ·‚µintŒ^•Ï”‚ğa‚É‘ã“ü‚µ‚Ü‚·B
		int a = Integer.parseInt(aStr);
		//³‚Ì®”‚ğ“ü—Í‚ğó•tbStr‚É‘ã“ü
		System.out.println("³‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String bStr = new java.util.Scanner(System.in).nextLine();
		//bStr‚ğintŒ^‚É•ÏŠ·‚µintŒ^•Ï”b‚É‘ã“ü
		int b = Integer.parseInt(bStr);
		//Š„‚èZ‚ğ‚µ‚ÄAˆÈ‰º‚Ì‚æ‚¤‚É•\¦‚µ‚Ä‚­‚¾‚³‚¢
		System.out.println("¤:"+a/b);
		System.out.println("—]‚è:"+a%b);
	}
}

		