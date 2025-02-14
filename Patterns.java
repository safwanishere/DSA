public class Patterns{

    public static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern2(int n){
        for (int i=0; i<n; i++){
            for (int j =0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int i=0; i<n; i++){
            for (int j=1; j<=i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<i+1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int i=1; i<=n; i++){

            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int i=0; i<n; i++){
            // space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            // star
            for (int j=0; j<(2*n-(2*i+1)); j++){
                System.out.print("*");
            }

            // space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n){
        // top half
        for (int i=1; i<=n; i++){

            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }

        // bottom half
        for (int i=0; i<n; i++){
            // space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            // star
            for (int j=0; j<(2*n-(2*i+1)); j++){
                System.out.print("*");
            }

            // space
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void pattern10(int n){
        int breakpoint;
        for (int i=1; i<2*n; i++){

            if (i<=n) breakpoint = i;
            else breakpoint = 2*n-i;

            for (int j=1; j<=breakpoint; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern11(int n){
        int print = 1;
        for (int i=0; i<n; i++){
            
            if (i%2==0) print = 1;
            else print = 0;

            for (int j=0; j<=i; j++){
                System.out.print(print);
                print = 1 - print;
            }

            System.out.println();
        }
    }

    public static void pattern12(int n){
        int breakpoint = 2*n-2;
        for (int i=1; i<=n; i++){
            // numbers
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }

            // spaces
            for (int j=1; j<=breakpoint; j++){
                System.out.print(" ");
            }


            // numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
            breakpoint -= 2;
        }
    }

    public static void pattern13(int n){
        int counter = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for (int i=0; i<n; i++){
            for (char c = 'A'; c<='A'+i; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for (int i=0; i<n; i++){
            for (char c = 'A'; c<='A'+n-i-1; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        char c = 'A';
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for (int i=1; i<=n; i++){

            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            char c = 'A';
            for (int j=1; j<=2*i-1; j++){
                System.out.print(c);
                if (j<i) c++;
                else c--;
            }

            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for (int i=0; i<n; i++){
            char c = (char) ('A'+n-1-i);
            for (int j=0; j<=i; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // pattern1(3);
        // pattern2(3);
        // pattern3(3);
        // pattern4(3);
        // pattern5(3);
        // pattern6(3);
        // pattern7(3);
        // pattern8(3);
        // pattern9(3);
        // pattern10(3);
        // pattern11(3);
        // pattern12(3);
        // pattern13(3);
        // pattern14(3);
        // pattern15(3);
        // pattern16(3);
        // pattern17(3);
        pattern18(3);
    }
}