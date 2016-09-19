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

    if (answer == 'y' + 'e' + 's') {
      turn = 0;
      userPlay((Board.gameboard), userchoice);
    }
    else {
      turn = 1;
      compPlay((Board.gameboard), xoro);
    }
    showBoard((gameboard));
    xvo--;

    boolean game = false;
    int winner = -1;   

    while (!game && xvo > 0) {
      
      game = isGameWon(board.gameboard, turn, userchoice, xoro); 

      if (done)
        winner = turn; 
      else {
        
        turn = (turn + 1 ) % 2;

        if (turn == 0)
          userPlay((Board.gameboard), userchoice);
        else
          compPlay(Board.gameboard), xoro);

        Board (Board.gameboard);
        xvo--;
      }
    }

    
    if (winner == 0)
      System.out.println("you won.");
    else if (winner == 1)
      System.out.println("you lost");
    else
      System.out.println("tie game");

  }

  }
}


	}


	
	
