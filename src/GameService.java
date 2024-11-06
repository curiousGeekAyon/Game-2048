import java.util.*;

public class GameService {
    Board board;

    public GameService(Board board) {
        this.board = board;
    }
    public void left()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
        for(int i=0;i<size;i++)
        {
            Queue<String>queue=new LinkedList<>();
            for(int j=0;j<size;j++)
                {
                    if(gameBoard[i][j]!=0&&!queue.isEmpty())
                        {

                            String[]arr=queue.poll().split(" ");
                            int x=Integer.parseInt(arr[0]);
                            int y=Integer.parseInt(arr[1]);
                            gameBoard[x][y]=gameBoard[i][j];
                            gameBoard[i][j]=0;
                            queue.add(i+" "+j);
                        }
                    else if(gameBoard[i][j]==0){
                        queue.add(i+" "+j);
                    }
                }
            boolean merged=false;
                for(int j=1;j<size;j++) {
                    if (gameBoard[i][j]!=0&&gameBoard[i][j - 1] == gameBoard[i][j]) {
                        System.out.println(gameBoard[i][j - 1]+" "+i+" "+j);
                        gameBoard[i][j - 1] += gameBoard[i][j];
                        gameBoard[i][j] = 0;
                        merged=true;
                    }
                }
            if(merged)
            {
                queue=new LinkedList<>();
                for(int j=0;j<size;j++)
                {
                    if(gameBoard[i][j]!=0&&!queue.isEmpty())
                    {

                        String[]arr=queue.poll().split(" ");
                        int x=Integer.parseInt(arr[0]);
                        int y=Integer.parseInt(arr[1]);
                        gameBoard[x][y]=gameBoard[i][j];
                        gameBoard[i][j]=0;
                        queue.add(i+" "+j);
                    }
                    else if(gameBoard[i][j]==0){
                        queue.add(i+" "+j);
                    }
                }
            }
        }
        if(!hasWon()&&!isGameOver())
        {
            setRandom();
            printBoard();
        }
        else{
            printBoard();
            if(hasWon())
            {
                System.out.println("Congratulations party do ");
            }
            else{
                System.out.println("Game over ");
            }
        }
    }
    public void right()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
        for(int i=0;i<size;i++)
        {
            Queue<String>queue=new LinkedList<>();
            for(int j=size-1;j>=0;j--)
            {
                if(gameBoard[i][j]!=0&&!queue.isEmpty())
                {

                    String[]arr=queue.poll().split(" ");
                    int x=Integer.parseInt(arr[0]);
                    int y=Integer.parseInt(arr[1]);
                    gameBoard[x][y]=gameBoard[i][j];
                    gameBoard[i][j]=0;
                    queue.add(i+" "+j);
                }
                else if(gameBoard[i][j]==0){
                    queue.add(i+" "+j);
                }
            }
            boolean merged=false;
            for(int j=size-2;j>=0;j--)
            {
                if (gameBoard[i][j + 1] == gameBoard[i][j]) {
                    gameBoard[i][j + 1] += gameBoard[i][j];
                    gameBoard[i][j] = 0;
                    merged=true;
                }
            }
            if(merged)
            {
                queue=new LinkedList<>();
                for(int j=size-1;j>=0;j--)
                {
                    if(gameBoard[i][j]!=0&&!queue.isEmpty())
                    {

                        String[]arr=queue.poll().split(" ");
                        int x=Integer.parseInt(arr[0]);
                        int y=Integer.parseInt(arr[1]);
                        gameBoard[x][y]=gameBoard[i][j];
                        gameBoard[i][j]=0;
                        queue.add(i+" "+j);
                    }
                    else if(gameBoard[i][j]==0){
                        queue.add(i+" "+j);
                    }
                }
            }
        }
        if(!hasWon()&&!isGameOver())
        {
            setRandom();
            printBoard();
        }
        else{
            printBoard();
            if(hasWon())
            {
                System.out.println("Congratulations party do ");
            }
            else{
                System.out.println("Game over ");
            }
        }
    }
    public void up()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
        for(int j=0;j<size;j++)
        {
            Queue<String>queue=new LinkedList<>();
            for(int i=0;i<size-1;i++)
            {

                if(gameBoard[i][j]!=0&&!queue.isEmpty())
                {

                    String[]arr=queue.poll().split(" ");
                    int x=Integer.parseInt(arr[0]);
                    int y=Integer.parseInt(arr[1]);
                    gameBoard[x][y]=gameBoard[i][j];
                    gameBoard[i][j]=0;
                    queue.add(i+" "+j);
                }
                else if(gameBoard[i][j]==0){
                    queue.add(i+" "+j);
                }
            }
            boolean merged=false;
            for(int i=1;i<size;i++)
                {
                if (gameBoard[i-1][j] == gameBoard[i][j]) {
                    gameBoard[i-1][j] += gameBoard[i][j];
                    gameBoard[i][j] = 0;
                    merged=true;
                }
            }
            if(merged)
            {
                queue=new LinkedList<>();
                for(int i=0;i<size-1;i++)
                    {
                        if(gameBoard[i][j]!=0&&!queue.isEmpty())
                        {

                            String[]arr=queue.poll().split(" ");
                            int x=Integer.parseInt(arr[0]);
                            int y=Integer.parseInt(arr[1]);
                            gameBoard[x][y]=gameBoard[i][j];
                            gameBoard[i][j]=0;
                            queue.add(i+" "+j);
                        }
                        else if(gameBoard[i][j]==0){
                            queue.add(i+" "+j);
                        }
                    }
            }
        }
        if(!hasWon()&&!isGameOver())
        {
            setRandom();
            printBoard();
        }
        else{
            printBoard();
            if(hasWon())
            {
                System.out.println("Congratulations party do ");
            }
            else{
                System.out.println("Game over ");
            }
        }
    }
    public void down()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
            for(int j=0;j<size;j++)
            {
                Queue<String>queue=new LinkedList<>();
                for(int i=size-1;i>=0;i--)
                {
                    if(gameBoard[i][j]!=0&&!queue.isEmpty())
                    {

                        String[]arr=queue.poll().split(" ");
                        int x=Integer.parseInt(arr[0]);
                        int y=Integer.parseInt(arr[1]);
                        gameBoard[x][y]=gameBoard[i][j];
                        gameBoard[i][j]=0;
                        queue.add(i+" "+j);
                    }
                    else if(gameBoard[i][j]==0){
                        queue.add(i+" "+j);
                    }
                }
                boolean merged=false;
                for(int i=size-2;i>=0;i--)
                {
                    if (gameBoard[i+1][j] == gameBoard[i][j]) {
                        gameBoard[i+1][j] += gameBoard[i][j];
                        gameBoard[i][j] = 0;
                        merged=true;
                    }
                }
                if(merged)
                {
                    queue=new LinkedList<>();
                    for(int i=size-1;i>=0;i--) {
                        if (gameBoard[i][j] != 0 && !queue.isEmpty()) {

                            String[] arr = queue.poll().split(" ");
                            int x = Integer.parseInt(arr[0]);
                            int y = Integer.parseInt(arr[1]);
                            gameBoard[x][y] = gameBoard[i][j];
                            gameBoard[i][j] = 0;
                            queue.add(i + " " + j);
                        } else if (gameBoard[i][j] == 0) {
                            queue.add(i + " " + j);
                        }
                    }
                }
            }
        if(!hasWon()&&!isGameOver())
        {
            setRandom();
            printBoard();
        }
        else{
            printBoard();
            if(hasWon())
            {
                System.out.println("Congratulations party do ");
            }
            else{
                System.out.println("Game over ");
            }
        }
    }
    public boolean checkStatus(){
        boolean won=hasWon();
        boolean gameover=isGameOver();
        if(gameover||won)
        {
            reset();
            return true;
        }
        else{
            setRandom();
            return false;
        }

    }
    public boolean isGameOver()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
                {
                    if(gameBoard[i][j]==0||gameBoard[i][j]==gameBoard[i][j+1])
                        {
                            return false;
                        }
                }
        }
        for(int j=0;j<size;j++)
        {
            for(int i=0;i<size-1;i++)
            {
                if(gameBoard[i+1][j]==gameBoard[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean hasWon()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(gameBoard[i][j]==2048)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public void setRandom()
    {
        int[][] gameBoard = board.getGameBoard();
        int size = board.getSize();
        List<int[]>emptycells=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
                {
                    if(gameBoard[i][j]==0) {
                        emptycells.add(new int[]{i, j});
                    }
                }
        }


            int countOfEmptyCells=emptycells.size();
        if(countOfEmptyCells==0)
        {
            return;
        }
            Random random = new Random();
            int index = random.nextInt(countOfEmptyCells);
            int x=emptycells.get(index)[0];
            int y=emptycells.get(index)[1];
            gameBoard[x][y]=(x+y)%2==0?2:4;
            gameBoard[x][y]=(x+y)%2==0?2:4;
    }
    public void start()
    {
        int[][] gameBoard= board.getGameBoard();
        printBoard();
        Random random=new Random();
        int countOfRandomSet=random.nextInt(3)+1;
        while(countOfRandomSet>0)
            {
                setRandom();
                countOfRandomSet--;
            }
    }
    public void printBoard()
    {
        int[][] gameBoard= board.getGameBoard();
        int size= board.getSize();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("/////////////////////////////////////");
    }
    public void reset()
    {
        int size= board.getSize();
        int[][]arr=new int[size][size];
        board.setGameBoard(arr);
        start();
    }
}
