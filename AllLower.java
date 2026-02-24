public static boolean allLower(String s){
        int f=0;
        for(char ch:s.toCharArray()){
            f=f|1<<(ch-'a');
        }
        return f==(1<<26)-1;
}
