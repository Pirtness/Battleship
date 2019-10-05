package battleship;

public class Destroyer extends Ship {
    public  Destroyer(int length) {
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
