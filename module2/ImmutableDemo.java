package module2;
public class ImmutableDemo {
    public static void main(String[] args) {
        String greet = "hello";

        String message = "hello".toUpperCase().toLowerCase();

       // System.out.println(greet == message);
       //String reference = greet.concat(" ").trim();
       System.out.println(message.equals(greet));
    }
}