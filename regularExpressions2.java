
public class regularExpressions2 {
    public static void main(String[] args) {
        String str1="abcdef";
        String str2="abcd6ef";
        String str3="abcbbccbaaaabc";
        String str4="ccddgsais";
        String str5="acc";
        String str6="accb";

        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str3.matches("[abc]*"));
        System.out.println(str4.matches("[abc]+"));
        System.out.println(str3.matches("[abc]+"));
        System.out.println(str6.matches("[abc]{3}"));
        System.out.println(str5.matches("[abc]{3}"));
        System.out.println(str5.matches("[abc]{3,7}"));
        System.out.println(str3.matches("[abc]{3,7}"));

        String str7 = "agarwal.devansh22dec@gmail.com";

        System.out.println(str7.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));


    
    
    
    
    }
}
