package hellohw;
import java.util.Scanner;
public class evenodd {
    static void main(String[] args) {
        System.out.println("enter you number: ");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0) System.out.println("number is even ");
        else System.out.println("number is odd");
    }
}
