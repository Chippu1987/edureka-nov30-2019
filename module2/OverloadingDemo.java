package module2;

public class OverloadingDemo {

    public static void main(String[] args) {
        double d1 = 45;
        int d2 = 56;
        sum(d1, d2);
    }

	private static void sum(int i, double j) {
        System.out.println("Came inside method 1 ");
        System.out.println("The sum is "+(i+j));
	}
	private static void sum(double i, int j) {
        System.out.println("Came inside method 2 ");
        System.out.println("The sum is "+(i+j));
	}

}