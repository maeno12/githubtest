/*
 * ¾¦IÈ^Ï·Tv
 * ì¬FM.Takahashi
 */
class Sample0802 {
	public static void main(String[] args) {
		// èEÏÌé¾Æú»
		final double TAX_RATE = 1.08;	// Å¦
		int price = 20;					// è¿

		// |¯ZÌÊð int^ÏÉãü
		int result = (int) (price * TAX_RATE);
//		int result = (int) price * TAX_RATE;//LXgZqÌ@ªDæÊª¢ÌRpCG[ªN«é
		System.out.println("resultF" + result);

		/*		//String^¨int^
		String a = "10";
		int b = Intger.parseInt(a);
		//String^¨double^
		String c = "12.34";
		double d = Double.parseDouble(c);
		//l(int/double)^¨String^
		int a = 10;
		String aStr = String.valueOf(a);
		Bl(int/double)^¨String^i©®IÈ^Ï·ðpj
		int a = 10;
		String aStr = "" + a;
*/
	}
}
