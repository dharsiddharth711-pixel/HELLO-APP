public class HelloApp {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
        } else {
            names.append("World");
        }

        System.out.println("Hello, " + names.toString() + "!");
    }
}
