import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
           /* 
            System.out.println("ENTER THE NUMBER FOR IT'S TABLE:");
            n=sc.nextInt();
            for(int i=1;i<=10;i++){
                int j = i*n;
                System.out.println(n+" x "+i+" = "+j);
            }
            */
            

            /*
            int sum=0;
            System.out.println("Enter the Nth number");
            n=sc.nextInt();

            for(int i=0; i<=n; i++){
                sum=sum+i;
            }

            System.out.println("THE SUM OF "+n+" NUMBERs IS "+sum);
            */

            System.out.println("Enter the Number for Factorial");
            n=sc.nextInt();
            long fact=1;
            for(int i=1; i<=n; i++){
                fact = fact*i;
            }

            System.out.println("Factorial is " +fact);
    }
}
