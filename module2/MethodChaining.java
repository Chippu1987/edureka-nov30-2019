package module2;
public class MethodChaining {
    public static void main(String[] args) {
        System.out.println("Inside the main method ....");
        method1();
        System.out.println("Inside the main method, after executing the method1 ....");
    }

	private static void method1() {
        System.out.println("Came inside the method 1");
        method2();
        System.out.println("Before exiting method 1");
	}

	private static void method2() {
        System.out.println("Came inside the method 2");
        method3();
        System.out.println("Before exiting method 2");
	}

	private static void method3() {
        System.out.println("Came inside the method 3");
        System.out.println("Before exiting method 3");
	}
}