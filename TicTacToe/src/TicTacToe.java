import java.util.Scanner;

public class TicTacToe
{
  public static Scanner scan = new Scanner(System.in);

  public static void choice(){
  {

    

    System.out.print("  Would you like to play as \"x\" or \"o\"? ");
    char userchoice = scan.next().toLowerCase().charAt(0);
    char xoro = (userchoice == 'x') ? 'o' : 'x';

    System.out.println();
    System.out.print("  Do you want to go first (yes or no)? ");
    char answer = scan.next().toLowerCase().charAt(0);

   
  }
}


	}


	
	