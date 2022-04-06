package at.campus02.iwi.battleships;

public class BattleShipMap {

    public int[][] map = {
            {0, 0, 0, 2, 0, 1, 1, 0, 0, 0 },
            {0, 3, -1, 2, 0, 0, 0, 2, 0, 0 },
            {0, 3, -1, 0, 4, 4, 0, 0, 2, 2 },
            {0, 0, 2, 0, 0, 0, 0, 0, 0, 0 },
            {-1, 0, 2, 0, -1, 2, 2, 0, 0, 0 },
            {-3, 1, 0, 0, -3, 0, -1, 0, 0, 3 },
            {0, 0, 0, -3, 0, 0, 0, -1, 0, 3 },
            {0, 0, -2, 0, -2, 0, -2, 0, 0, 0 },

    };

    public void print() {
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    System.out.format(" 0\t");
                } else {
                    System.out.format("%+d\t", map[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int totalBattleShipStrength(char player){
        /* player == 'A' > postive Numbers */
        /* player == 'B' > negative Numbers */



        return 0;
    }

    // returns total number of ships
    public int totalCountBattleShips() {

        return 0;
    }

    // returns a one-dim-array with count in every line
    public int[] countOfShipsPerLine() {

        return null;
    }

    // returns the average ship strength of player A ships (positive numbers)
    public double averageShipStrengthPlayerA(){

       return 0.0;
    }
}
