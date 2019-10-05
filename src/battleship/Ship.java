package battleship;

import java.lang.reflect.Array;

public class Ship {

    int bowRow;
    int bowColumn;
    int length;
    boolean horizontal;
    boolean[] hit = new boolean[4];

    //override it?
    int getLength() {return length;}
    int getBowRow() {return bowRow;}
    int getBowColumn() {return  bowColumn;}

    void setHorizontal(boolean horizontal){
        this.horizontal = horizontal;
    }

    String getShipType(){
        return "";
    }

    boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean){

        if ((row < 0 || row > 9) && (column < 0 || column > 9))
            return false;
        if (this.horizontal)
        {
            //поменять местами столбец и строгу в цикле)
            int i = column - 1 >= 0 ? column - 1 : column;
            int j = column + length <= 9 ? column + length : column + length - 1;
            for (; i < j; ++i)
            {
                for (int k = -1; k <= 1; ++k)
                {
                    //доделать, проверить все эти точки на выход за границы и на отсутствите кораблей
                }
            }
        }


        return true;
    }

    void placeShipAt(int row, int column, boolean horizontal, Ocean ocean){
        bowRow = row;
        bowColumn = column;
        this.horizontal = horizontal;
        //dodelat'
    }

    boolean shootAt(int row, int column){
        if (horizontal && row >= bowRow && row < bowRow + length && column == bowColumn) {
            hit[row - bowRow] = true;
            return  true;
        }
        if (!horizontal && column >= bowColumn && column < bowColumn + length && row == bowRow)
        {
            hit[column - bowColumn] = true;
            return true;
        }
        return false;
    }

    boolean isSunk()
    {
        for (int i = 0; i < length; ++i)
        {
            if (!hit[i])
                return false;
        }
        return true;
    }

}
