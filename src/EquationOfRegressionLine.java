
public class EquationOfRegressionLine {
	
	public static double bOne(double sigX, double sigY, double sigXY, double squareX, int n)
	{
		
		double topLeft = n * sigXY;
		double topRight = sigX * sigY;
		double top = topLeft - topRight;
		
		
		double bottom = (n*squareX)-(sigX*sigX);
		
		double answer = top / bottom;	
		return answer;
	}
	
	public static double bar(double letter, int n)
	{
		double total = letter / n;
		return total;
	}
	
	public static double r(double sigX, double sigY, double sigXY, double squareX, double squareY, int n)
	{
		double topLeft = n * sigXY;
		double topRight = sigX * sigY;
		double top = topLeft - topRight;
		
		
		double bottomLeft = Math.sqrt((n*squareX)-(sigX*sigX));
		double bottomRight = Math.sqrt((n*squareY)-(sigY*sigY));
		double bottom = bottomLeft * bottomRight;
		
		double answer = top / bottom;
		return answer;
	}
	
	public static void main(String[] args)
	{
		double sigX = Double.parseDouble(args[0]);
		double sigY = Double.parseDouble(args[1]);
		
		double sigXY = Double.parseDouble(args[2]);
		
		double squareX = Double.parseDouble(args[3]);
		double squareY = Double.parseDouble(args[4]);
		
		int n = Integer.parseInt(args[5]);

		double r = r(sigX, sigY, sigXY, squareX, squareY, n);
		double b1 = bOne(sigX, sigY, sigXY, squareX, n);
		double xBar = bar(sigX, n);
		double yBar = bar(sigY, n);
		double b0 = yBar - (b1 * xBar);
		
		System.out.println("y = " + b0 + " + " + b1 + "x");
		System.out.println ("r = " + r);
		System.out.println ("y bar = " + yBar);
	}
}
