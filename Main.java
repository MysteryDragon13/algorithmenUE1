
public class Main {

    static boolean checkPosition(boolean[][] array, int column, int line){//could queen be placed here
        int n=array.length;
        for (int i = 0; i < n; i++) {
            if(array[column][i] || array[i][line]){//checks line and column
                return false;
            }
            /*
            //still gotta check diagonal

            array[column-i][line-i]
            array[column+1][line+i]
            array[column-i][line+i]
            array[column+1][line-i]


            if(){
                return false;
            }

             */

        }
        return true;
    }

    static boolean placeQueen(boolean[][] array, int line){
        System.out.println("l:"+ line);
        boolean found=false;
        for (int i = 0; i < array.length; i++) {//check all columns
            if(checkPosition(array,i,line)){//if free
                array[i][line]=true;//place queen
                //arrays are allready a pointer in java so this changes in the main function too
                found=true;
            }
        }
        //no place found this line:
        if(line+1 < array.length){//recall for next line until full
            found=placeQueen(array,line+1);
        }
        return found;
    }

    static boolean existPath(int[][] adjazenzMatrix, int start, int end){
        //matrix[x][y]==1 means x and y are connected, 0 means not
        //if start isn't connected to end check another connection with start if its connected to end etc. if not
        //x=y => 0

        return false;
    }

    static void printBoard(boolean[][] array){
        int n=array.length;
        //System.out.println("board size: "+ n);
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print("|");
                if(array[y][x]){
                    System.out.print("X");
                }else{
                    System.out.print("_");
                }
            }
            System.out.print("|\n");
        }
    }

    public static void main(String[] args) {
        int n=8;
        boolean[][] array=new boolean[n][n];
        for (int y = 0; y < n; y++) {//fill false
            for (int x = 0; x < n; x++) {
                array[y][x]=false;
            }
        }


        placeQueen(array,0);

        printBoard(array);

    }
}