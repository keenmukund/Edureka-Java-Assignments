import java.util.Scanner;
public class MessageGame{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Jill Choose one number between  1-10 : ");
		int num = sc.nextInt();
		switch(num){
			case 1:
				System.out.println("Hi Jill");
				break;
			case 2:
				System.out.println("Hello Jill");
				break;
			case 3:
				System.out.println("Lookin nice Jill");
				break;
			case 4:
				System.out.println("Can i talk to u Jill");
				break;
			case 5:
				System.out.println("Please Jill");
				break;
			case 6:
				System.out.println("Sorry Jill");
				break;
			case 7:
				System.out.println("Come on Jill");
				break;
			case 8:
				System.out.println("Hey Jill");
				break;
			case 9:
				System.out.println("R u coming Jill");
				break;
			case 10:
				System.out.println("Please tell me Jill");
				break;
			default :
			System.out.println("Enter the number between 1-10");
		}
	}
}