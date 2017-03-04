import java.util.Scanner;
public class VenMachine {

	public static void main(String[] args) {
		int amount , halfs , quarters ,qirshs , origAmount ;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		amount = origAmount = input.nextInt();
		
		halfs = amount / 50;
		amount %= 50;  // amount = amount % 50;
		quarters = amount / 25 ;
		amount %= 25;
		qirshs = amount / 10;
		amount%= 10 ;
		
		System.out.println("Original amount = " + origAmount + "\n"
				+ " change:  \n"
				+ " halfs      = " + halfs + "\n"
				+ " Quarters   = " + quarters + "\n"
				+ " qirshs     = " + qirshs + "\n"
				+ " halals     = " + amount + "\n");
		

	}

}
