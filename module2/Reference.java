package module2;
public class Reference {
    public static void main(String[] args) {
        int [] array = new int[] {10,20,30,40};

        int [] reference = array;
        reference[0] = 200;
        reference[1] = 400;
        reference[2] = 600;
        reference[3] = 800;

        System.out.println(array[0]);
    }
}