public class StringMethod {
    public static void main(String[] args) {
        String s="welcome";
        String s1=" to java";
        System.out.println(s.length());
        System.out.println(s.concat(s1));

        s=" welcome ";
        System.out.println(s.trim());

        s="welcome";
        System.out.println(s.charAt(3));

        s="Welcome";
        System.out.println(s.contains("Wel"));

        s="welcome";
        s1="Welcome to lava";
        System.out.println(s.equalsIgnoreCase("welcome"));

        System.out.println(s.replace("java","love"));
        System.out.println(s1.replace("Welcome"," not welcome"));
        System.out.println(s.substring(4,7));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());







    }
}
