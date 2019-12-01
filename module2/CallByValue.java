package module2;

public class CallByValue {
    public static void main(String[] args) {
        int initialValue = 10;
        System.out.println("Before calling the changeVariableValue method, "+
            " the value of initialValue is  "+initialValue);
        changeVariableValue(initialValue);
        System.out.println("After calling the changeVariableValue method, the value of initialValue is  "+initialValue);
    }

	private static void changeVariableValue(int initialValue) {
        System.out.println("Inside the changeVariableValue:: Before "+initialValue);
        initialValue = initialValue + 1;
        System.out.println("Inside the changeVariableValue:: After "+initialValue);
	}
}