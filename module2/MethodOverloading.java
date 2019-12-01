package module2;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Executing the functions of a calculator ....");
        //int result = sum(4588, 55, 45);
        //System.out.println("The result of operation is "+result);
        double result = withdrawMoney(45000);
        System.out.println("Withdrew money "+result);

        System.out.println("Priniting string");
        System.out.println(56);
        System.out.println(true);
        System.out.println('d');
    }

    public static double withdrawMoney(double money){
        return money;
    }
    
    public static double withdrawMoney(double money, String accountType){
        return money;
    }
    public static double withdrawMoney(double money, String bankName,  String accountType){
        return money;
    }


    public static int sum(int a, int b ){
        return (a + b);
    }

    public static int sum(int a, int b, int c ){
        return (a + b + c);
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