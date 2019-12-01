public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        int initialValue = 10;

        for (int row = 0; row < 5; row++){
            for (int col = 0; col < 5; col++){
                matrix[row][col] = initialValue ++;
            }
        }

        for (int row = 0; row < 5; row++){
            for (int col = 0; col < 5; col++){
                System.out.print(matrix[row][col]+ "\t") ;
            }
            System.out.println();
        }
    }
}