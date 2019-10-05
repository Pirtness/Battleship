package battleship;

public class Battleship extends Ship {

    public Battleship(int length) {
        this.length = length;
        //hit init
    }

    @Override
    String getShipType() {
        return "battleship";
    }

    @Override
    public String toString() {
        if (isSunk())
            return "x";
        return "s";
    }
}
