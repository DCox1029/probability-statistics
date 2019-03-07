
public class ConfidenceIntervalMarginofError {

	public static double hats(double x, double n)
	{
		double hat = x / n;
		return hat;
	}
	
	public static double Q(double hat)
	{
		double Q = 1.0 - hat;
		return Q;
	}
	
	public static double E(double p1hat, double p2hat, double q1hat, double q2hat, double n1, double n2)
	{
		double top1 = p1hat * q1hat;
		double left = top1 / n1;
		
		double top2 = p2hat * q2hat;
		double right = top2 / n2;
		
		double added = left + right;
		double root = Math.sqrt(added);
		
		return root * 1.96;
	}
	
	public static void main(String[] args)
	{
		double mainX1 = Integer.parseInt(args[0]);
		double mainX2 = Integer.parseInt(args[1]);
		double mainN1 = Integer.parseInt(args[2]);
		double mainN2 = Integer.parseInt(args[3]);
		
		double hats1 = hats(mainX1, mainN1);
		double hats2 = hats(mainX2, mainN2);
		double q1 = Q(hats1);
		double q2 = Q(hats2);
		
		double answer = E(hats1, hats2, q1, q2, mainN1, mainN2);
		System.out.println("Margin of error: " + answer);
		System.out.println("Confidence interval estimate: " + ((hats1 - hats2) - answer) + " < (p1 - p2) < " + ((hats1 - hats2) + answer));
	}
}
