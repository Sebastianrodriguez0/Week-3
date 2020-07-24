import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		int a = 0, e = 0, i = 0, u = 0, o = 0, nonvowels = 0;
		String category;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a String to be processed for vowels: ");
		category = scan.nextLine();

		char userstring[] = category.toCharArray();

		for(int k = 0; k < userstring.length; k++)
		{
		switch (userstring [k])
		{
		case 'a' :
			a++;
				break;
		case 'e' :
			e++;
				break;
		case 'i' :
			i++;
				break;
		case 'o' :
			o++;
				break;
		case 'u' :
			u++;
				break;
			default:
		nonvowels++;
		}
		}

		System.out.println("Number of a's = "+a);
		System.out.println("Number of o's = "+o);
		System.out.println("Number of i's = "+i);
		System.out.println("Number of e's = "+e);
		System.out.println("Number of u's = "+u);
		System.out.println("Number of nonvowels = "+nonvowels);
		}


}

