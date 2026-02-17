package hellohw;

import java.util.Scanner;

public class ulcase
{
   public  static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you alphabet: ");
        char c=sc.next().charAt(0);
        int ch=c;
        if(ch>=65 &&  ch<=90){
            System.out.println("this is a capital alphabet");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("this is a alphabet");
        }
        else{
            System.out.println("not a alphabet");
        }
    }
}
