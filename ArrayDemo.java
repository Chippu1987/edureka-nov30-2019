public class ArrayDemo {
    public static void main(String[] args) {
        // array syntax
       /*
        int [] array = new int[10];
        array[0] = 0;
        array[1] = 11;
        array[2] = 22;
        */

        //initializing the array with values
        int  array [] = {11, 22, 33, 44, 55, 66, 77, 88};

        array[10] = 67;

        for (int index = 0; index < array.length; index ++){
            System.out.println("The value of "+index + " is "+array[index]);
        }
    }

}