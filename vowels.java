package hellohw;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you alphabet: ");
        char c=sc.next().charAt(0);
        int ch=c;
           if(ch>=97 && ch<=122) {
               if (ch == 97 || ch == 101  || ch==105 ||  ch ==117 || ch== 111) {
                   System.out.println("this is a vowel");
               }
               else{
                   System.out.println("this is a consonant");
               }

           }
           else{
               System.out.println("this is a not a alphabet");
           }
    }

}



