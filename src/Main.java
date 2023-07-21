import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int i;
        int noOfSnakes;
        int noOfLadders;
        int noOfPlayers;
        String name;
        int start;
        int end;

        Board board = new Board(100);

        System.out.println("Enter the number of Snakes");
        noOfSnakes = obj.nextInt();
        obj.nextLine();

        for(i=0;i<noOfSnakes;i++)
        {
            start = obj.nextInt();
            end = obj.nextInt();
            obj.nextLine();

            board.addSnakes(start,end);
        }

        System.out.println("Enter the number of Ladders");
        noOfLadders = obj.nextInt();
        obj.nextLine();

        for(i=0;i<noOfLadders;i++)
        {
            start = obj.nextInt();
            end = obj.nextInt();
            obj.nextLine();

            board.addLadders(start,end);
        }

        System.out.println("Enter the number of Players");
        noOfPlayers = obj.nextInt();
        obj.nextLine();

        for(i=0;i<noOfPlayers;i++)
        {
            name = obj.nextLine();

            board.addPlayers(name);
        }

        board.startGame();
    }
}