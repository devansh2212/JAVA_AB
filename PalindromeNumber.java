import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int r,rev=0;
        System.out.print("Reverse of Number is: ");
        while(n!=0){
            r=n%10;
            rev = (rev*10)+r;
            n=n/10;
            
            System.out.print(r);
        }
        System.out.println();
        if(x==rev){
            System.out.println("It is a palindrome ");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
