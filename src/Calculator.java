import java.util.Scanner;

public class Calculator {
    static void sum(int n1, int n2){
        int result = n1 + n2;
        System.out.printf("%s + %s = %s\n", n1,n2,result);
    }

    static void minus(int n1,int n2) {
        int result = n1 - n2;
        System.out.printf("%s - %s = %s\n", n1,n2,result);
    }

    static void multiply(int n1, int n2){
        int result = n1 * n2;
        System.out.printf("%s x %s = %s\n", n1,n2,result);
    }

    static void divide(int n1, int n2) {
        if(n2 == 0){
            System.out.println("Number cannot be divided by zero");
        }
        double result = n1 / n2;
        System.out.printf("%s / %s = %s\n", n1,n2,result);
    }

    static void pow(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.printf("%s^%s = %s\n", n1,n2,result);
    }

    static int factorial(int n1) {
        if (n1 >= 1)
            return n1 * factorial(n1 - 1);
        else
            return 1;
    }

    static void mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.printf("%s %% %s = %s\n", n1,n2,result);
    }

    static void rectangles(int n1, int n2) {
        int perimeter = 2 * (n1 + n2);
        int area = n1 * n2;
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);

    }


    public static void main(String[] args) {

        int n1;
        int n2;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.print("First Number : ");
        n1 = input.nextInt();

        System.out.print("Second Number : ");
        n2 = input.nextInt();

        do {
            System.out.println("""
                    -------------------------------------------
                    1 - Sum
                    2 - Minus
                    3 - Multiply
                    4 - Divide
                    5 - Pow
                    6 - Factorial
                    7 - Mod
                    8 - Area and Perimeter of Rectangles
                    9 - Exit
                    ------------------------------------------""");
            System.out.print("Make Your Choice : ");
            select = input.nextInt();
            if (select < 1 || select > 9 ){
                System.out.println("Invalid");
            }


            switch (select) {
                case 1 -> sum(n1, n2);
                case 2 -> minus(n1, n2);
                case 3 -> multiply(n1, n2);
                case 4 -> divide(n1, n2);
                case 5 -> pow(n1, n2);
                case 6 -> System.out.println(factorial(n1));
                case 7 -> mod(n1,n2);
                case 8 -> rectangles(n1,n2);


            }

        }while (select != 9);
        System.out.println("See You Later..");

    }
}
