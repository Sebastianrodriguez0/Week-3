import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int num, sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		num = scan.nextInt();
			if(num < 2){
				System.out.println("ERROR: Integer is less than 2.");
				System.out.print("Enter an integer greater than 2: ");
				
				num = scan.nextInt();
						}
			if(num % 2 != 0) num--;
				int e = num / 2;
				sum = e * (e + 1);
			System.out.println("The sum of all even integers between 2 and input value is: "+ sum);
		 }

}

