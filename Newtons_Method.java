
public class Newtons_Method {

	//Tolerance for Bisection Method function
	static final float TOL = (float) 0.0001;
	
	public static void main(String[] args) {
		
		//Initial guess and max iterations
		float a = 1;
		float n = 50;

		System.out.format("The root of the equation is: %-10f", NewtonsMethod(a,n));
	}

	
	//f(x) equation that you wish to find the root of
		public static float equation(float x) {
			return (float) (3*Math.pow(x, 3) - 2*Math.pow(x, 2) + 5*x - 2*(Math.pow(Math.E, x)) + 1); 
		}
	
	//f'(x)
	public static float Derivative_equation(float x) {
		return (float) (9*Math.pow(x, 2) - 4*x + 5 - 2*(Math.pow(Math.E, x))); 
	}

	//Newton's Method implementation
	//Input is the initial guess a for the equation and the max iterations n
	//equation is based on the input equations above
	public static float NewtonsMethod(float a, float n) {
		
		int counter = 1;
		float pOld = a - (equation(a)/Derivative_equation(a));
		float p = 0;
		
		System.out.println("______________________________________________");
		System.out.format("|   Step    |    p0    |    p     |    TOL   |%n");
		System.out.println("______________________________________________");

		//Starts while loop for max of N iterations
		while(counter <= n) {
			p = pOld - (equation(pOld)/Derivative_equation(pOld));

			//Checks the TOL hasn't been met and stops if it has
			if(Math.abs(p-pOld) < TOL) {
				System.out.format("|     %d     |%+-10f|%+-10f|%-10f|%n", counter, pOld, p, Math.abs(p-pOld));
				pOld = p;
				counter++;
				System.out.println("______________________________________________");
				return p;
			}
				System.out.format("|     %d     |%+-10f|%+-10f|%-10f|%n", counter, pOld, p, Math.abs(p-pOld));
				pOld = p;
				counter++;
		}
		System.out.println("______________________________________________");

		return p;
	}
	
	
	
	
	
	
	
}

