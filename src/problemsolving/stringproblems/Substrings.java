package problemsolving.stringproblems;

public class Substrings {
    public static void main(String[] args) {
        substrings("code");
    }
    public static void substrings(String str){
        for(int i = 0;i<str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
