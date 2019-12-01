package module2;

public class StringDemo {
    public static void main(String[] args) {
        String  name = "    Edureka    ";
        String secondName = "eDuRekA";

        System.out.println(name.equals(secondName));
        System.out.println(name.contains("z"));
        System.out.println(name.length());
        System.out.println(name.substring(0, 4));
        System.out.println(name.endsWith("eka"));
        System.out.println(name.startsWith("Edu"));
        System.out.println(name.replace('e','M'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("with spaces >>"+ name+"<<");
        
        System.out.println("with spaces >>"+ name.trim()+"<<");


    }

}