public class printing2 {
    public static void main(String[] args) {
        System.out.printf("hello\n");

        int x=10;
        int a=-10;
        float y = 12.56f;
        float b = 123.45f;
        char z='A';
        String str="Java Program";
        System.out.printf("Hello %d %f %c World %s",x,y,z,str);
        System.out.printf("\n%3$s %2$f %1$d",x,y,str);
        System.out.printf("\n%5d", x);
        System.out.printf("\n%05d", x);
        System.out.printf("\n%(5d", a);
        System.out.printf("\n%5f", b);
        System.out.printf("\n%5.2f", b);




    }
}
