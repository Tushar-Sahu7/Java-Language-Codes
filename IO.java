import java.util.Scanner;

class IO{
  void main(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.printf("The first number is : " + a);
    sc.close();
  }
}