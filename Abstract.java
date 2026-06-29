
abstract class Person
{
    String name;

Person()
{

}
//abstract void display();
}
interface identifiable
{
    void identify();
}
class Student extends Person implements identifiable
{

    Student(String name) {
        this.name =name;
    }
    public void display()
    {
        System.out.println("Name:"+name);
    }
    @Override
    public void identify()
    {
        System.out.println("I am a student");
    }
   
}


public class Abstract {
    public static void main(String[] args) {
        Student s=new Student("Nihad");
        s.display();
        s.identify();
    }
    
}
