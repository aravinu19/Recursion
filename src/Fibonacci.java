import java.util.Scanner;

public class Fibonacci {

    static int fib(int number){
        if (number == 0){
            return 0;
        }else if ( number == 1 ){
            return 1;
        }else {
            return fib(number - 1) + fib(number - 2);
        }
    }

    public static void main(String[] ivara){

        System.out.println("Enter in a number to compute:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("the fibonacci number is : " + fib(n));

    }

}
