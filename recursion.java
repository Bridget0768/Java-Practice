public class recursion {
    public static int sum(int m){
        if (m > 0){
            return m + sum(m-1);
        }else{
            return 0;
        }
    }
  public static void main(String[] args){
    System.out.println(sum(10));
  }  
}
