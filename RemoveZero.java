class RemoveZero{
  public static void main(String[] args){
   String str = "00000123789";
   Remove(str,11);
  }
  public static void Remove(String str,int n){
   String s="";
   for(int i=0;i<n;i++){
      if(str.charAt(i)!='0')
       s= s+str.charAt(i);
    }
    System.out.println(s);
  }
}