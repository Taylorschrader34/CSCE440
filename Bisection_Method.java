
public class Bisection_Method {

	//Tolerance for Bisection Method function
	static final float TOL = (float) 0.0001;
	
	public static void main(String[] args) {
		
		//Interval that you wish to run your function between
		float a = 0;
		float b = 1;
		
		System.out.format("The root of the equation is: %-10f", BisectionMethod(a,b));
	}

	
	//f(x) equation that you wish to find the root of
	/*public static float equation(float x) {
		return (float) (3*Math.pow(x, 3) - 2*Math.pow(x, 2) + 5*x - 2*(Math.pow(Math.E, x)) + 1); 
	}*/
	
	public static float equation(float x) {
		return (float) ((Math.sqrt((4 - (Math.pow(x, 3)))) / 2) - x); 
	}
	

	//Bisection Method implementation
	//Input is the [a,b] interval for the equation
	//equation is based on the input equation above
	public static float BisectionMethod(float a, float b) {

		//p is the mid point between a & b'
		//This sets p to a for the first entrance into while loop
		float p = a;
		
		System.out.println("___________________________________________________________________");
		System.out.format("|    a     |    b     |    p     |   f(a)   |   f(b)   |   f(p)   |%n");
		System.out.println("|__________|__________|__________|__________|__________|__________|");
		//Checks that the terminating condition has not been met
		while(Math.abs(equation(p)) > TOL) {
			
			//Sets p to midpoint between a & b
			p = (a+b)/2;
			
			System.out.format("|%+-10f|%+-10f|%+-10f|%+-10f|%+-10f|%+-10f|%n", a, b, p, equation(a), equation(b), equation(p));
			//Switches values of a or b depending on value of f(p)
			
			if(equation(p) > 0 && equation(a) > 0) {
				a = p;
			}else if(equation(p) < 0 && equation(a) < 0) {
				a = p;
			}else{
				b = p;
			}
		}
		
		System.out.println("___________________________________________________________________");
		return p;
	}
	
	
	
	
	
	
	
}

