public class regularExpressions {
    public static void main(String[] args) {
        String str1="a";
        String str2="abc";
        String str3="p";
        String str4="%";
        String str5="A";
        String str6="a7";
        String str7="%3";
        String str8="7";
        String str9=" ";
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        System.out.println(str1.matches("abc"));
        System.out.println(str2.matches("abc"));
        System.out.println(str1.matches("[abc]"));
        System.out.println(str2.matches("[abc]"));
        System.out.println(str3.matches("[^abc]"));
        System.out.println(str1.matches("[^abc]"));
        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str4.matches("[a-z0-9]"));
        System.out.println(str5.matches("[a-z0-9]"));
        System.out.println(str6.matches("[a-z][0-9]"));
        System.out.println(str7.matches("[a-z][0-9]"));
        System.out.println(str1.matches("a|b"));
        System.out.println(str3.matches("a|b"));
        
        System.out.println(str1.matches("\\d"));//is a digit
        System.out.println(str8.matches("\\d"));//is not a digit
        System.out.println(str1.matches("\\W"));//is not a digit or special character
        System.out.println(str4.matches("\\W"));//is not a special character
        System.out.println(str9.matches("\\s"));//is a space
        System.out.println(str9.matches("\\S"));//is not a space


    }
}
