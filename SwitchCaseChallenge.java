import java.util.Scanner;

public class SwitchCaseChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /* 
        System.out.println("Enter Day Number:");
        int n = sc.nextInt();
        switch(n)
        {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Not a valid day");
                    break;

        }
    */



        System.out.println("Enter Domain Name");
        String domain=sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com":System.out.println("Commercial");
                    break;
            case "net":System.out.println("Network");
                    break;
            case "org":System.out.println("Organisation");
                    break;
            case "gov":System.out.println("Government");
                    break;
            default : System.out.println("Either a country domain or not a valid domain");
                    break;

            

        }
    }
}
