public class string_challenge3 {
     public static void main(String[] args) {
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        String str1 = "abc     def     ghi   123";
        System.out.println(str1.replaceAll("\\s+"," ").trim());
        str1=str1.replaceAll("\\s+"," ").trim();
        String words[] = str1.split("\\s");
        System.out.println(words.length);
     }
    
}
