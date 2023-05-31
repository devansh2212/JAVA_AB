public class string_practice2 {
    public static void main(String[] args) {
        /*
        String str1 = "Mr. Devansh Agarwal";
        System.out.println(str1.startsWith("Mr. "));
        System.out.println(str1.startsWith("Dev"));
        System.out.println(str1.startsWith("Dev",4));
        System.out.println(str1.endsWith("arwal"));
        System.out.println(str1.charAt(4));
        for(int i=0; i<str1.length(); i++){
            System.out.print(str1.charAt(i));    
        }
        System.out.println(' ');
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf('a',8));
         */

        String str1 = "Pyramid";
        String str2 = "pyramid";
        String str3 = new String("Pyramid");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(str1.contains("ram"));
        System.out.println(str1.concat(str2));


    }
}
