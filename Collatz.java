// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // to get Num
		// to start counting from 1 - Num
		// each time to start the calc from i
		// to calc and count how many calc we had
		// to print each one
		// c/v opt
		int Num = Integer.parseInt(args[0]);
		String Mode = args[1];
		if (Num != 0 && (Mode.equals("c") || Mode.equals("v"))) {
			for (int i = 1; i <= Num ; i++){
				int a = i;
				String Collatz = String.valueOf(a);
				if (a%2 == 0) {
					a/=2;
					Collatz = Collatz+ " " +String.valueOf(a);
				}else{
					a = (a*3) +1;
					Collatz = Collatz+ " " +String.valueOf(a);
				}int b = 2 ;
				while (a != 1) {
					if (a%2 == 0) {
					a/=2;
					Collatz = Collatz+ " " +String.valueOf(a);
					b +=1;
					}else{
						a = a*3 +1;
						Collatz = Collatz+ " " +String.valueOf(a);
						b+=1;
						}
				}if (Mode.equals("v")){
					System.out.println(Collatz + " ("+b+")");}
			}
			System.out.println("Every one of the first " + Num + " hailstone sequences reached 1.");
		}

	}
}
