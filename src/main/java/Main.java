public class Main {
    public static void main(String[] args) {
        String finalName;

        if (args.length > 0) {
            finalName = String.join(", ", args);
        } else {
            finalName = "World";
        }

        System.out.println("Hello, " + finalName + "!");
    }
}