public static boolean isPalindrome(String s){
  int f=0;
  for(char ch:s.toCharArray()){
    f=f^(1<<(ch-'a'));
  }
  return (f==0 || (f&(f-1))==0);
}
