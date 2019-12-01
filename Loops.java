public class Loops {
    public static void main(String[] args) {
        //int [] array = new int[]{11,22,33,44};

          int[] array = new int []{11, 22, 33, 'c', 'd'};
       /* for ( int index = 0; index < array.length; index ++ ){
            System.out.println("Value is "+ array[index]);
        }
        */

        int index = 0;
        /*while ( index  < array.length){
            System.out.println(array[index++]);
        }*/

       /* 
       do {
            System.out.println(array[index++]);
        } while (index < array.length);
        */

        //enhanced for loop
        if (array != null ){
            for (int value :  array){
                System.out.println(value);
            }
        }
    }
}