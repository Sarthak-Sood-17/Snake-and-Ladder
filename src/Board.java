import java.util.ArrayList;

public class Board {

    int size;
    Snakes snake = new Snakes();
    Ladders ladder = new Ladders();
    Dice dice = new Dice();
    ArrayList<Players> players = new ArrayList<>();
    Board(int size)
    {
        this.size=size;
    }

    public void addSnakes(int start, int end) {

        snake.add(start, end);
    }

    public void addLadders(int start, int end) {

        ladder.add(start, end);
    }

    public void addPlayers(String name) {
        Players player = new Players(name);

        players.add(player);
    }

    public void startGame() {

        int i;

        Players player;

        int diceRoll;

        int position,positionA,positionB;

        for(i=0;i<players.size();i++)
        {
            player = players.get(i);

            diceRoll = dice.roll();

            System.out.println("Player : "+player.name+" | Position : "+player.position+" | Dice Rolled : "+diceRoll);

            position = player.addToPosition(diceRoll, size);

            positionA = snake.check(position);

            positionB = ladder.check(position);

            if(positionA!=-1)
                position=positionA;

            if(positionB!=-1)
                position=positionB;

            player.updatePosition(position);

            if (position == size)
            {
                System.out.println("\nPlayer " + player.name + " has won the Game!");
                break;
            }

            i = (i+1)%players.size()-1;

            System.out.println("");
        }

        System.out.println("\nGame End");
    }
}
