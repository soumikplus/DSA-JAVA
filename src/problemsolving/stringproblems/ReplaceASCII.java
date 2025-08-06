package problemsolving.stringproblems;

public class ReplaceASCII {
    public static void main(String[] args) {
        System.out.println("Replaced String : "+ replaceAscii("cdgHKjL"));
    }
    private static String replaceAscii(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0;i<sb.length();i++){

            char ch = sb.charAt(i);
                // checking odd or even
                if((i & 1) == 0) ch = (char)(ch+1);
                else ch = (char)(ch-1);
            sb.setCharAt(i,ch);
        }
        // converting the StringBuilder to string
        return sb.toString();
    }
}
