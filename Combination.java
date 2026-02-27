public class Combo{
    public static void helper(String str){
    
        for(int i=1;i<(1<<str.length());i++){
            for(int j=0;j<str.length();j++){
                if((i|(1<<j))==i){
                    System.out.print(str.charAt(j)+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        String str="abc";
        helper(str);
    }
}
