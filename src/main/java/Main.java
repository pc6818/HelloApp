public class Main {
    public static void main(String[] args) {
        String finalName;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            if (nameBuilder.length() > 0) {
                finalName = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                finalName = nameBuilder.toString();
            }
        } else {
            finalName = "World";
        }

        System.out.println("Hello, " + finalName + "!");
    }
}