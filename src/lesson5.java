/**
 * @(#)lesson5.java
 *
 * lesson5 application
 *
 * @author 
 * @version 1.00 2015/9/1
 */
 
public class lesson5 {
	public static void main(String[] args) {
		final double E = 2.718;
		final int NUM_STUDENTS = 236;
		final double Area;
		Area = 203.49;
		/* int cnt = 27.2;
		System.out.println(cnt); */
		double d = 78.1;
		int fg = (int)d;
		System.out.println(fg);
		double /* alt */ f4 = 22;
		System.out.println(f4);
		int j = 61/3;
		System.out.println(j);
		System.out.println((double)(90/9));
		System.out.println(4 + 6.0/4 + 5 * 3 - 3);
		
		int p = 3;
		double yee = 10.3;
		int gg = (int)5.9;
		System.out.println(p + p * yee - 3 * gg);
		System.out.println(p + p * (int)yee - 3 * gg);
		
		int dividend = 12, divisor = 4, quotient = 0, remainder = 0;
		int dividend2 = 13, divisor2 = 3, quotient2 = 0, remainder2 = 0;
		quotient = dividend/divisor;
		remainder = dividend % divisor;
		quotient2 = dividend2 / divisor2;
		remainder2 = dividend2 % divisor2;
		System.out.println(quotient);
		System.out.println(remainder);
		System.out.println(quotient2);
		System.out.println(remainder2);
		
		double b = 50;
		int n = 5;
		int m = (int)b/n;
		System.out.println(m);

		int done = 7;
		done *= .5;
		System.out.println(done);
	}
	static void oldThings() {
    	
    	double q = 29.78;
    	int w = 105;
 
    	// int i = d; -- Illegal - Information is lost (god this sounds like windows 95)
    	int e = (int)q;
    	double r = w; // Legal - No information lost
    	
    	int t = 4;
    	double y = 3;
    	double ans = t/y; // Equals 1.3 repeating (double precision)

		double u /* giggle */ = (double)5/4; // Equivalent to 5.0/4 (why write extra code tho?)

		int i = 5;
		int o = 4;
		double p = (double)(i/o); //i and o are in their own world and divide as integers before conversion to a double.

		final double PI = 3.14159;
		// PI = 3.7789 Illegal, and you must be pretty dumb :(
		final double megaPI;
		megaPI = 3.14159; // Legal since it hasn't been set yet.

		final String NAME = "Peewee Herman"; // What's with the sudden caps pfeffer
		final int LUNCH_COUNT = 122; // That's a lot of burgers for Peewee
		
    	System.out.println(e);
    	System.out.println(r);
    	System.out.println(ans);
    	System.out.println(20 + 5 * 6.0); // Returns a double!
    	System.out.println(3 + 5.0/2 + 5 * 2 - 3); // 12.5
    	System.out.println(3.0 + 5/2 + 5 * 2 - 3); // 12.0
    	System.out.println((int)(3.0 + 4)/(1 + 4.0) * 2 - 3); // -.2
    	System.out.println(u);
    	System.out.println(p);
    }
}
