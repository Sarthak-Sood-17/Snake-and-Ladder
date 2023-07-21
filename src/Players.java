public class Players {

    String name;
    int position;

    Players(String name)
    {
        this.name = name;
        position=0;
    }
    public int addToPosition(int diceRoll, int size) {

        position += diceRoll;

        if(position > size)
            position -= diceRoll;

        return position;
    }


    public void updatePosition(int position) {

        this.position = position;
    }
}
