// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // need to get from user how many calc we need to do
		// we need to make for loop to clac and use our calc
		int Num = Integer.parseInt(args[0]);
		double a = 1.0;
		double b = -1;
		double pi = 0;
		for (int i = 0 ; i < Num ; i++){
			double c = Math.pow(b , i)/a ;
			pi += c;
			a +=2;
		}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     " + pi*4);

	}
}
