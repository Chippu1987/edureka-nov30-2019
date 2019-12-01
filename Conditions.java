public class Conditions {
    public static void main(String[] args) {
        
        boolean flag = false;
        int noOfVacationDays = 50;

        /*
        if ( noOfVacationDays > 50  ){
            System.out.println("The condition satisfied and printed this block");
        } else  if (noOfVacationDays < 50){
            System.out.println("The condition did not satisfy and printed this block");
        } else {
            System.out.println("The default condition got executed ..");
        }
        */

        String result = noOfVacationDays < 50 ? "vacation days exhaused" : "vacation days are remaining";
        System.out.println("Result "+result);
    }
}