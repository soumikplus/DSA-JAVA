package problemsolving.recursion.patternproblems;

public class Pattern3 {
    public static void displayPattern(int row , int col, int N){
        if(row > N) return;                     // all rows are printed
        if(col >N-row+1){                            // everything printed on current row
            System.out.println();               // newline before going to next row
            displayPattern(row+1,1,N);    // moving to next row
            return;
        }
        System.out.print("* ");
        displayPattern(row,col+1,N);        // moving to next column
    }
    public static void main(String[] args) {

        displayPattern(1,1,5);
    }
}
