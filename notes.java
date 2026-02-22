package hellohw;
import java.util.Scanner;
public class notes {
    public static void main(String[] args) {
        System.out.println("enter the amount: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int five=n/500;
        n%=500;
        int hun=n/100;
        n%=100;
        int ft=n/50;
        n%=50;
        int tw=n/20;
        n%=20;
        int ten=n/10;
        n%=10;
        int fv=n/5;
        n%=5;
        int two=n/2;
        n%=2;
        int one=n/1;
        n%=1;
        System.out.println("500: "+five);
        System.out.println("100: "+hun);
        System.out.println("50: "+ft);
        System.out.println("20: "+tw);
        System.out.println("10: "+ten);
        System.out.println("5: "+fv);
        System.out.println("2: "+two);
        System.out.println("1: "+one);

    }
}
