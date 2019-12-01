public class ContinueDemo {
    public static void main(String[] args) {
        //System.out.println("The arguments passed are "+args[0] + " second argument "+args[1] );
        
        boolean flag = true;
        
        for (int index = 0; flag; index ++){
            if (index < 10) {
                continue;
            }

            if (index == 15){
                flag = false;
                continue;
            }
            System.out.println("Current value of index is "+ index);
        }
        System.out.println("Exited out of for loop !!");
    }
}