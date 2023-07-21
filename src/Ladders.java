import java.util.HashMap;

public class Ladders {

    HashMap<Integer, Integer> ladder = new HashMap<>();
    public int check(int position) {

        if(ladder.containsKey(position))
        {
            System.out.println(">>Player has climbed a Ladder and landed on Position "+ladder.get(position));
            return ladder.get(position);
        }

        return -1;
    }

    public void add(int start, int end) {

        ladder.put(start, end);
    }
}
