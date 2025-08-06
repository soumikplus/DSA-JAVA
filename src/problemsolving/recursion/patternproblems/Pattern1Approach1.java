package problemsolving.recursion.patternproblems;

public class Pattern1Approach1 {
    private static void printRows(int n){
        if(n<=0) return;
        System.out.print("* ");
        printRows(n-1);
    }
    private static void displayPattern(int n,int totalRows){
        if(n<=0) return;
        printRows(totalRows);
        System.out.println();
        displayPattern(n-1,totalRows);
    }
    public static void main(String[] args) {
        int n = 5;
        displayPattern(n,5);
    }
}
