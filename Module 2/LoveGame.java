import java.util.Scanner;
public class LoveGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Michael please enter your number :");
		int michael = sc.nextInt();
		System.out.println("Bruce please enter your number :");
		int bruce = sc.nextInt();
		if(michael > bruce){
			System.out.println("Bruce you are out of the game!!");
		}else{
			System.out.println("Michael you are out of the game!!");
		}
		
	}
}
