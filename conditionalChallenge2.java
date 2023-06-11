import java.util.Scanner;

public class conditionalChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
        String num;
        System.out.println("Enter a Number");
        num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal Radix=8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Octal Radix=10");
        }    
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Octal Radix=16");
        }
        else{
            System.out.println("Not a number");
        }
        */

        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Not a Leap Year");
                }
                else{
                    System.out.println("Leap Year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }

        else{
            System.out.println("Not a Leap Year");
        }

    }
}
