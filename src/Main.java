import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        Board board=new Board(4);
        GameService gameService=GameService.getGameService(board);
        int[][]gameBoard= board.getGameBoard();
        gameService.start();
        Scanner sc=new Scanner(System.in);
        while(!gameService.checkStatus())
        {
            System.out.println("Give input");
            try {
                int option = sc.nextInt();
                switch (option){
                    case 0:
                        gameService.left();
                        break;
                    case 1:
                        gameService.right();
                        break;
                    case 2:
                        gameService.up();
                        break;
                    case 3:
                        gameService.down();
                        break;
                    default:System.out.println("invalid input ,choose between 0,1,2,3");
                        continue;
                }
            }
            catch (Exception e)
            {
                System.out.println("wrong input format");
                sc.nextLine();
            }
        }
    }
}