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
        if (n == "")
        {
            throw new NullPointerException("Cannot use a blank name");
        }
        System.out.println("How old are you?");
        a = scan.nextInt();
        if (a < 0)
        {
            throw new IllegalArgumentException("Cannot use a negative age");
        }
        HelloWorld student = new HelloWorld(n);
        student.greet();
        student.greet("Hey there!");
        HelloWorld student2 = new HelloWorld(n, a);
        student2.introduce();
    }
}
