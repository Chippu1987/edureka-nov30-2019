public class SwitchCaseDemo {
    public static void main(String[] args) {
            String currentDay = "SUNDAY";
            switch(currentDay){
                case "SUNDAY" :
                    System.out.println("Its an end to the weekend");
                    break;
                case "MONDAY":
                    System.out.println("Beginning of the week starts today");
                    break;
                case "TUESDAY":
                    System.out.println("Busy tuesday");
                    break;
                case "WEDNESDAY":
                    System.out.println("Balanced weekday ");
                    break;
                case "THURSDAY":
                    System.out.println("Crushing the work and closing off the tasks ");
                    break;
                case "FRIDAY":
                    System.out.println("Prepare for Weekend ");
                    break;
                case "SATURDAY":
                    System.out.println("Weekend is finally here !! ");
                    break;
                default:
                    System.out.println("Lets play this again !!");
            }
    }
}