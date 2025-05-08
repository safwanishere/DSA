import java.util.Scanner;

public class GCD{
    static int GCDof(int a, int b){
        int limit = a > b ? b : a;
        int gcd = 1;

        for (int i=limit; i>=2; i--){
            if (a%i==0 && b%i==0){
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = scan.nextInt();
        System.out.print("Enter second number : ");
        int b = scan.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is : " + GCDof(a, b));
    }
}