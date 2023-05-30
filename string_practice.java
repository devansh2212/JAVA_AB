public class string_practice {
    public static void main(String[] args) {
        /*** 
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        System.out.println(str1);
        System.out.println(str2);
        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);
        System.out.println(str3);
        byte b[] = {65,66,67,68,69};
        String str4 = new String (b,2,2);
        System.out.println(str4);
*/
/*
 
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1==str2);
        String str3 = new String("Java");
        System.out.println(str2==str3);
        * 
 */
        String str= new String("netbeans");
        String str2= new String("   netbeans   ");
        int s=str.length();
        System.out.println(s);
        String u = str.toUpperCase();
        System.out.println(u);
        String t = str2.trim();
        System.out.println(t);
        String ss = str.substring(2);
        System.out.println(ss);
        String sbs = str.substring(2, 5);
        System.out.println(sbs);
        String r = str.replace('e', 'm');
        System.out.println(r);
        




    }
}
