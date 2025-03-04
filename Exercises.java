import java.util.Scanner;

public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        // todo
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        // todo
        long a = 0, b = 1, index = 1;
        while (b < n) {
            long temp = a + b;
            a = b;
            b = temp;
            index++;
        }
        if (b == n) {
            return index;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        // todo
        char[][] triangle = new char[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == n - 1 || j == 0 || j == i) {
                    triangle[i][j] ='*' ;
                }else {
                    triangle[i][j] = ' ';
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        long a = in.nextLong();
        Exercises p = new Exercises();
        boolean result = p.isPrime(a);
        System.out.println("Is the number prime? " + result);

        System.out.print("Enter a number to find its Fibonacci index: ");
        long b = in.nextLong();
        long fibonacciIndex = p.fibonacciIndex(b);
        System.out.println("Fibonacci index of " + b + " is: " + fibonacciIndex);

        System.out.print("Enter the size for the triangle: ");
        int c = in.nextInt();
        char[][] triangle = p.generateTriangle(c);

        System.out.println("Triangle:");
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
