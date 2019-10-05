package battleship;

public class Submarine extends Ship {
    public Submarine(int length) {
        this.length = length;
        //hit init
    }

    @Override
    String getShipType() {
        return "submarine";
    }

    @Override
    public String toString() {
        if (isSunk())
            return "x";
        return "s";
    }
}
