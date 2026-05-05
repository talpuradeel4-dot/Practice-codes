import java.util.*;

public class Gcd{
    public static int calculateGcd(int a, int b){
        while( b!= 0){
            int temp = b;
            b = a % b;;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter value of a: ");
     int a = sc.nextInt();
     System.out.print("Enter value of b: ");
     int b = sc.nextInt();

     System.out.print("GCD: "+calculateGcd(a,b));
    }
}
