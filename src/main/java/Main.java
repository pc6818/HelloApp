public class Main {
    public static void main(String[] args){
        String finalName;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            finalName = nameBuilder.toString();
        } else {
            finalName = "World";
        }

        System.out.println("Hello, " + finalName + "!");

        String name = "world";

        if (args.length > 0){
            name = args[0];
        }

        String name = args[0];

        System.out.println("Hello, " + name +"!");
    }
}