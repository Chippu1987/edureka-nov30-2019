package module2;

public class CallByReference {
    public static void main(String[] args) {
        int [] array = new int[] {11, 12, 13, 14, 15};

        callByReference(array);
        
        System.out.println("Inside the main method:: after "+array[0]);
        System.out.println("Inside the main method:: after "+array[1]);
        System.out.println("Inside the main method:: after "+array[2]);
        System.out.println("Inside the main method:: after "+array[3]);
        System.out.println("Inside the main method:: after "+array[4]);
    }

	private static void callByReference(int[] array) {
        System.out.println("Inside the callByReference method:: before "+array[1]);
        System.out.println("Inside the callByReference method:: before "+array[0]);
        System.out.println("Inside the callByReference method:: before "+array[2]);
        System.out.println("Inside the callByReference method:: before "+array[3]);
        System.out.println("Inside the callByReference method:: before "+array[4]);
        System.out.println("******************************************************");

        array[0] = 11;
        array[1] = 22;
        array[2] = 33;
        array[3] = 44;
        array[4] = 55;

        System.out.println("Insdie teh callByReference method:: after "+array[0]);
        System.out.println("Insdie teh callByReference method:: after "+array[1]);
        System.out.println("Insdie teh callByReference method:: after "+array[2]);
        System.out.println("Insdie teh callByReference method:: after "+array[3]);
        System.out.println("Insdie teh callByReference method:: after "+array[4]);
        System.out.println("******************************************************");
	}
}