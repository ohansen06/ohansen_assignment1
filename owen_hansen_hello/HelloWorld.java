package owen_hansen_hello;
public class HelloWorld
{
    String name;
    public HelloWorld(String name)
    {
        this.name = name;
    }
    public void greet()
    {
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args)
    {
        HelloWorld student = new HelloWorld("Owen");
        student.greet();
    }
}