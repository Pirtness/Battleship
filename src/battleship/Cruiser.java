package battleship;

public class Cruiser extends Ship {
    public Cruiser(int length) {
        this.length = length;
        //hit init
    }

    @Override
    String getShipType() {
        return "cruiser";
    }

    @Override
    public String toString() {
        if (isSunk())
            return "x";
        return "s";
    }
}
