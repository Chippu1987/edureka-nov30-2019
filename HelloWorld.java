/**
 * This class is a demonstration of hello world
 * @author pradeep
 * @version 1.0
 * @since 1.0
 */
public class HelloWorld {

    /**
     * This is a method level comment
     * 
     * @param args
     * @since 1.0
     * @return void
     */
    public static void main (String args[]) {
        
        // Single line comment. This is one line comment

        /*
           This is a multi line comment.
           There can
           be
           any number of 
           lines and will 
           be ignored by the 
           compiler
        */

        //data types
        // data type name variable_name = value;

        int value = 34;
        //variable naming rules
        /*
          1. The variable name should not be keyword or reserve word
             for, class, while, swtich,if, else, if else, throw, throws, boolean, true ,false
          2. The variable name are case sensitive
              hello =/ Hello =/ hElLo   
          3. The variable name can contain alpha numeric and special characters can be either _ or $
          4. The variable name cannot start with number
        */
        //variable naming convetions
        /*
         1. The variable names for data should start with smaller case 
         2. The method names also should start with smaller case
         3. The variable names for class should start with Capital letter
         4. If two words are used in the variable name, it should follow camel case syntaxt
            employeeName, employeeAge, employeeSalary
         4. Declare meaningfull names 
             a. do not use variable names like i, j, k 
             b. declare meaningfull names
                numberOfEmployees, nameOfCompany,   
        */

         int numberOfEmployees = 56;
         boolean isMarried = false;
         char character = 't';
         long distanceBetweenEarthAndSun = 20_00_00_000;   

         double empWeight = 87.55;
         float averageSalary = 2444.45f;


        System.out.println("Hello world....");
        System.out.println("value of numberOfEmployees is "+numberOfEmployees);
        System.out.println("value of isMarried is "+isMarried);
    }

}