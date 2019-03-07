
public class LinearCorrelation {
	
	
	public static void main(String[] args)
	{
		double sigX = Double.parseDouble(args[0]);
		double sigY = Double.parseDouble(args[1]);
		
		double sigXY = Double.parseDouble(args[2]);
		
		double squareX = Double.parseDouble(args[3]);
		double squareY = Double.parseDouble(args[4]);
		
		int n = Integer.parseInt(args[5]);
		
		double topLeft = n * sigXY;
		double topRight = sigX * sigY;
		double top = topLeft - topRight;
		
		
		double bottomLeft = Math.sqrt((n*squareX)-(sigX*sigX));
		double bottomRight = Math.sqrt((n*squareY)-(sigY*sigY));
		double bottom = bottomLeft * bottomRight;
		
		double answer = top / bottom;
		
		System.out.println(answer);
	}
}
