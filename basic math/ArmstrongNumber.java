import java.util.Scanner;

public class ArmstrongNumber{

    static boolean isArmstrong(int n){
        int check = 0;
        int og = n;
        int count = (int) Math.abs(Math.log10(n) + 1);

        while (og > 0){
            int ld = og % 10;
            check += Math.pow(ld, count);
            og /= 10;
        }

        return n == check;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        System.out.println(isArmstrong(n));
    }
}