package hellohw;
import java.util.Scanner;
public class month
{
  public    static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number: ");
      int c= sc.nextInt();
      switch(c){
          case 1:
              System.out.println("January");
              break;
          case 2:
              System.out.println("feb");
              break;
          case 3:
              System.out.println("march");
              break;
          case 4:
              System.out.println("april");
              break;
          case 5:
              System.out.println("may");
              break;
          case 6:
              System.out.println("june");
              break;
          case 7:
              System.out.println("july");
              break;
          case 8:
              System.out.println("august");
              break;
          case 9:
              System.out.println("sept");
              break;
          case 10:
              System.out.println("october");
              break;
          case 11:
              System.out.println("november");
              break;
          case 12:
              System.out.println("December");
              break;

          default:
              System.out.println("enter a relevant number");
      }
    }
}
