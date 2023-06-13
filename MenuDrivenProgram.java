import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("______________________");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");

        System.out.println("ENTER 2 NUMBERS");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in Words ");
        String str=sc.nextLine();
        str=str.toUpperCase();


        switch(str){
            case "ADD": System.out.println(x+y);
                    break;
            case "SUB": System.out.println(x-y);
                    break;
            case "MUL": System.out.println(x*y);
                    break;
            case "DIV": System.out.println(x/y);
                    break;
            default:    System.out.println("Invalid Option");
                    break;
                
        }
    }
}
