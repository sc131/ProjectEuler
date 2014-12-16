public class EulerProblem2{
  
  public static void main(String[] args){
    int sum = 0;
    int fib = 0;
    int hold = 1;
    int fibLess1 = 1;
    while(fib < 4000000){
      fibLess1 = hold;
      hold = fib;
      fib = hold + fibLess1;
      if(fib%2 == 0)
        sum+= fib;
      System.out.println(fib);
    }
    System.out.println(sum);
  }
  
}