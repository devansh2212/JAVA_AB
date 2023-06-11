import java.util.Scanner;
public class conditionalChallenge {
    public static void main(String[] args) {
    /*  //Even odd
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    */


    /*
    //young and not young

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your age:");
        n=sc.nextInt();

        if(n<14||n>55){
            System.out.println("NOT YOUNG");
        }

        else{
            System.out.println("YOUNG");
        }
    */


    //Grades finder
    Scanner sc = new Scanner(System.in);
    int m1,m2,m3;
    System.out.println("Enter marks fore 3 subjects");
    m1= sc.nextInt();
    m2= sc.nextInt();
    m3= sc.nextInt();

    int total = m1+m2+m3;
    int avg = total/3;

    if(avg>=70){
        System.out.println("A");
    }

    else if(avg<70&&avg>=60){
        System.out.println("B");
    }
    else if(avg<60&&avg>=50){
        System.out.println("C");

    }
    else if(avg<50&&avg>=40){
        System.out.println("D");
    }
    else{
        System.out.println("F");
    }







    }
}
