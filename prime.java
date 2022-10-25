import java.util.*;
class Prime{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to check if it is prime");
    int n = sc.nextInt();
    int c=0;
    if(n==0||n==1)
      System.out.println(n + " is not a prime number");
    else{
    for(int i=2;i<=n/2;i++){
      if(n%i==0)
        c++;
    }
    if(c>0)
      System.out.println(n + " is not a prime number");
    else
      System.out.printlnn(n + " is a prime number");
    }
  }
}
