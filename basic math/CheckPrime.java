import java.util.Scanner;

public class CheckPrime{
    static boolean isPrime(int n){
        for (int i=2; i<n/2; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scan.nextInt();

        System.out.println(isPrime(n));
    }
}