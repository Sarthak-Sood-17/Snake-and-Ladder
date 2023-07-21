import java.util.HashMap;

public class Snakes {

    HashMap<Integer, Integer> snake = new HashMap<>();
    public int check(int position) {

        if(snake.containsKey(position))
        {
            System.out.println(">>Player is bitten by a Snake and landed on Position "+snake.get(position));
            return snake.get(position);
        }

        return -1;
    }

    public void add(int start, int end) {

        snake.put(start,end);
    }
}
