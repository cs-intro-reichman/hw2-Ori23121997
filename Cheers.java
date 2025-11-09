
public class Cheers {
        public static void main(String[] args) {
                // I need to get Sring and int from user
		// than i need to print it int times and to cut the string to charecters
		// so i need to use the length and index of charecters
		// to get it char to upper char 
		// to add the upper char to the text 

		String Cheers = args[0];
		int Num = Integer.parseInt(args[1]);
		int LengthCheers = Cheers.length();
		Cheers = Cheers.toUpperCase();
		for (int i = 0; i < LengthCheers; i++){
			if (Cheers.charAt(i) == 'A' || Cheers.charAt(i) == 'E'|| Cheers.charAt(i) == 'F'
			|| Cheers.charAt(i) == 'H'|| Cheers.charAt(i) == 'I' || Cheers.charAt(i) == 'L'
			|| Cheers.charAt(i) == 'M'|| Cheers.charAt(i) == 'N'|| Cheers.charAt(i) == 'O'||
			 Cheers.charAt(i) == 'R'|| Cheers.charAt(i) == 'S'|| Cheers.charAt(i) == 'X' ){
				System.out.println("Give me " + "an " + Cheers.charAt(i) + ": " +
				Cheers.charAt(i)+"!");
			 }else{
				System.out.println("Give me " + "a  " + Cheers.charAt(i) + ": " +
				Cheers.charAt(i)+"!");
			 }
		}
		System.out.println("What does that spell?");
		for (int n = 0; n<Num; n++){
			System.out.println(Cheers+"!!!");
		}
        }
}
