package owen_hansen_hello;
public class HelloWorld
{
    String name;
    private int age;
    public HelloWorld(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public HelloWorld(String name)
    {
        this.name = name;
    }
    public void greet()
    {
        System.out.println("Hello, " + name + "!");
    }

    public void introduce()
    {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    public void greet(String message)
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        HelloWorld student = new HelloWorld("Owen");
        student.greet();
    }
}