import java.net.SocketTimeoutException;
import java.util.Scanner;

public class conditionalChallenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int day = sc.nextInt();

        if(day==1){
            System.out.println("MONDAY");
        }
        else if(day==2){
            System.out.println("TUESDAY");
        }
        else if(day==3){
            System.out.println("WEDNESDAY");
        }
        else if(day==4){
            System.out.println("THURSDAY");
        }
        else if(day==5){
            System.out.println("FRIDAY");
        }
        else if(day==6){
            System.out.println("SATURDAY");
        }
        else if(day==7){
            System.out.println("SUNDAY");
        }
        else{
            System.out.println("NOT A VALID DAY");
        }
*/

System.out.println("ENTER A URL:");
String url = sc.nextLine();
String protocol = url.substring(0,url.indexOf(":"));

    if(protocol.equals("https")){
        System.out.println("Hypertext Transfer Protocol");
    }
    else if(protocol.equals("ftps")){
        System.out.println("File Transfer Protocol");
    }

String ext = url.substring(url.lastIndexOf(".")+1);

    if(ext.equals("com")){
        System.out.println("Commercial");
    }
    else if(ext.equals("org")){
        System.out.println("organisation");
    }
    else if(ext.equals("net")){
        System.out.println("network");
    }
    else{
        System.out.println("A country");
    }




    }

}
