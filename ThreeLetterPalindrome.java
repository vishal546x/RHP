public static long helper(String s){
    long ans=0;
    int[]rt=new int[26];
    int[]lt=new int[26];
    for(int i=0;i<s.length();i++){
      rt[s.charAt(i)-'a']+=1;
    }
    for(int i=0;i<s.length();i++){
      int mid=s.charAt(i)-'a';
      rt[mid]--;
      for(int j=0;j<26;j++){
        ans+=lt[j]*rt[j];
      }
      lt[mid]++;
    }
    return ans;
  }
