public class string_challenge2 {
    public static void main(String[] args) {
        int b = 1000110;
        String str1="234A";
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        System.out.println(str1.matches("[0-9A-F]+"));
    }
}
