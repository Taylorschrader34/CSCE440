
public class Secant_Method {

	//Tolerance for Bisection Method function
	static final float TOL = (float) 0.0001;
	
	public static void main(String[] args) {
		
		//Interval that you wish to run your function between
		float p0 = 1;
		float p1 = (float) 0.99;
		float n = 10;
		
		System.out.format("The root of the equation is: %-10f", SecantMethod(p0,p1,n));
	}

	
	//f(x) equation that you wish to find the root of
		public static float equation(float x) {
			return (float) (3*Math.pow(x, 3) - 2*Math.pow(x, 2) + 5*x - 2*(Math.pow(Math.E, x)) + 1); 
		}

	//Secant Method implementation
	//Input is the initial guess p0 and p1 for the equation and the max iterations n
	//equation is based on the input equation above
	public static float SecantMethod(float p0, float p1, float n) {

		int counter = 1;
		float p = 0;
		System.out.println("______________________________________________");
		System.out.format("|   Step    |    p0    |    p1    |    TOL   |%n");
		System.out.println("______________________________________________");
		
		//Starts while loop for max of N iterations
		while(counter <= n) {
			p = p1 - ((equation(p1) * (p1 - p0))/ (equation(p1) - equation(p0)));

			//Checks the TOL hasn't been met and stops if it has
			if(Math.abs(p-p1) < TOL) {
				System.out.format("|     %d     |%+-10f|%+-10f|%-10f|%n", counter, p1, p, Math.abs(p-p1));
				p1 = p;
				counter++;
				System.out.println("______________________________________________");
				return p;
			}
				System.out.format("|     %d     |%+-10f|%+-10f|%-10f|%n", counter, p1, p, Math.abs(p-p1));
				p1 = p;
				counter++;
		}
		System.out.println("______________________________________________");
		
		return p;
	}
	
	
	
	
	
	
	
}

