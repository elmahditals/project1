public class StringExamples {
    public static void main(String[] args) {
        String welcome = "  welcome to mehdi tals e ";
        System.out.println(welcome.length());
        System.out.println(welcome.charAt(17));
        System.out.println(welcome.indexOf("t"));
        System.out.println(welcome.indexOf("mehdi"));
        char a = 'e';
        for (int i = 0; i < welcome.length(); i++) {
            if (welcome.charAt(i) == a) {
                System.out.println(i);
            } }
        System.out.println(welcome.substring(8,16));
        System.out.println(welcome.replace("e", "z"));
        System.out.println(welcome.toUpperCase());
        System.out.println(welcome.trim());
        System.out.println(welcome.contains("mehdi"));

    }
}

