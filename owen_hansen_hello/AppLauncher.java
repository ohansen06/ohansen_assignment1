package owen_hansen_hello;
import java.util.Scanner;
public class AppLauncher
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String n;
        int a;
        System.out.println("What is your name?");
        n = scan.nextLine();
        System.out.println("How old are you?");
        a = scan.nextInt();
        HelloWorld student = new HelloWorld(n);
        student.greet();
        student.greet("Hey there!");
        HelloWorld student2 = new HelloWorld(n, a);
        student2.introduce();
    }
}
