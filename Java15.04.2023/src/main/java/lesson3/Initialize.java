package lesson3;

public class Initialize {
    private static final String CONST = getConst();
    private String stringField = getString();

    public Initialize(String d) {
        System.out.println(d + " in constructor initialization");
    }

    static {
        System.out.println("Static 1");
    }

    {
        System.out.println("Block  1");
    }

    static {
        System.out.println("Static 2");
    }

    {
        System.out.println("Block 2");
    }

    private static String getConst() {
        System.out.println("CONST initialization");
        return "CONST";
    }

    private String getString() {
        System.out.println("stringField initialization");
        return "sField";
    }

    public static void main(String[] args) {
        new Initialize("FIRST");
        new Initialize("SECOND");
    }
}
