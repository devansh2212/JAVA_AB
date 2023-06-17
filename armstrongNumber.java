import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        int digits=0;
        int check=0;
        
        int n = sc.nextInt();
        int x = n;

        while(n!=0){
            r=n%10;
            check =check + r*r*r;
            n=n/10;
            digits++;
            System.out.print(" "+r);
            
            
        } 

        if(check==x){
            System.out.println();
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println();
            System.out.println("Not a Armstrong number");
        }
        System.out.println(); 
        System.out.println("NO. OF DIGITS: "+digits);
    }
}
