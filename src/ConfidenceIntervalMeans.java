
public class ConfidenceIntervalMeans {
	static double total;
	
	public static double E(double s1, double s2, double n1, double n2)
	{
		double s1Square = s1 * s1;
		double left = s1Square / n1;
		
		double s2Square = s2 * s2;
		double right = s2Square / n2;
		
		double added = left + right;
		double root = Math.sqrt(added);
		
		if (n1>250)
		{total = root * 1.968;}
		if (n1==27)
		{total = root * 2.056;}
		if (n1==31)
		{total = root * 2.042;}
		
		return total;
	}
	
	public static void main(String[] args)
	{
		double mainS1 = Double.parseDouble(args[0]);
		double mainS2 = Double.parseDouble(args[1]);
		
		double mainN1 = Integer.parseInt(args[2]);
		double mainN2 = Integer.parseInt(args[3]);
		
		double mainX1 = Double.parseDouble(args[4]);
		double mainX2 = Double.parseDouble(args[5]);
		
		double answer = E(mainS1, mainS2, mainN1, mainN2);
		System.out.println(answer);
		System.out.println("Confidence interval estimate: " + ((mainX1 - mainX2) - answer) + " < (u1 - u2) < " + ((mainX1 - mainX2) + answer));
	}
	
}
	
