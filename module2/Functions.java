package module2;

public class Functions {
    public static void main(String[] args) {
        System.out.println("Executing the functions of a calculator ....");
        double result = division(4588, 55);
        System.out.println("The result of operation is "+result);
    }

    public static int sum(int a, int b ){
        return (a + b);
      //  System.out.println("This will be unreachable code and hence will not compile..");
    }

    public static int subtract(int a, int b ){
        return ( a - b);
    }

    public static int product(int a, int b ){
        return (a * b);
    }

    public static double division(double a, double b ){
        return (a / b);
    }
}