package battleship;

import java.util.Random;

public class Ocean {
    Ship[][] ships = new Ship[10][10];
    int shotsFired;
    int hitCount;
    int shipsSunk;

    Ocean() {
        for (int i = 0; i < 10; ++i)
            for (int j = 0; j < 10; ++j) {
                ships[i][j] = new EmptySea();
                shotsFired = 0;
                hitCount = 0;
                shipsSunk = 0;
            }
    }

    void placeAllShipsRandomly() {
        Random r = new Random();
        int row;
        int col;

    }

    boolean isOccupied(int row, int column){
        int step;
        for(int i = 0; i < 4; ++i)
        {
            step = column - i;
            if (step >= 0 && !(ships[row][step].getShipType().equals(""))){
                if (ships[row][step].horizontal && ships[row][step].length > i)
                    return true;
            }
        }
        for(int i = 0; i < 4; ++i)
        {
            step = column - i;
            if (step >= 0 && !(ships[step][row].getShipType().equals(""))){
                if (!ships[step][row].horizontal && ships[step][row].length > i)
                    return true;
            }
        }
        return false;
    }

    boolean shootAt(int row, int column){
        shotsFired++;
        int step;
        for(int i = 0; i < 4; ++i)
        {
            step = column - i;
            if (step >= 0 && !(ships[row][step].getShipType().equals(""))){
                if (ships[row][step].horizontal && ships[row][step].length > i && !ships[row][step].isSunk())
                    hitCount++;
                    return true;
            }
        }
        for(int i = 0; i < 4; ++i)
        {
            step = column - i;
            if (step >= 0 && !(ships[step][row].getShipType().equals(""))){
                if (!ships[step][row].horizontal && ships[step][row].length > i && !ships[row][step].isSunk())
                    hitCount++;
                    return true;
            }
        }
        return false;
    }

    int getShotsFired() {return shotsFired;}
    int getHitCount() {return hitCount;}
    int getShipsSunk() {return shipsSunk;}
    boolean isGameOver() {
        for (int i = 0; i < 10; ++i)
            for (int j = 0; j < 10; ++j){
                if (!ships[i][j].isSunk() || ships[i][j].getShipType() != "")
                    return false;
            }
        return true;
    }

    Ship[][] getShipArray(){
        return ships;
    }

}
