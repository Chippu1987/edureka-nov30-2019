package module2;
public class StringBufferDemo {
    public static void main(String[] args) {

        String address = "";
        address.concat("Mr");
        address.concat("2nd Cross");

        /*
          ""
          "MR"
          ""+"MR"
          "2nd Cross"
          ""+"MR"+"2nd Cross"
        */

        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("hello");
        stringBuffer.append(" ");
        stringBuffer.append("world");
        stringBuffer.append(" using ");
        stringBuffer.append(" Java ");
        System.out.println(stringBuffer.toString());
        /*
         "hello"
         " "
         "world"
         "using"
         "java"
        */
    }
}