public class conditional_Statement {
    public static void main(String[] args) {
        int a=5,b=10,c=15;
        System.out.println(a<b);
        System.out.println(a<b && a<c);
        System.out.println(a<b && a>c);
        System.out.println(a<b || a>c);
        
        float x=5.4f,y=5.5f;
        System.out.println(x<y);

        int n=5;

        if(n>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }


        int q=5,w=14,e=4;

        if (q>w && q>e){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        int A=3,B=5,C=7;
        if(A>B && A>C){
            System.out.println(A);
        }
        else if(B>C){
            System.out.println(B);
        }
        else{
            System.out.println(C);
        }


    }
}
