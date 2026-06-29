abstract  class Animal {
}
interface flyable
{
    void fly();
}
class Bird extends Animal implements flyable
{
    public void sound()
    {
          System.out.println("Chip Chip");
    }
    @Override
    public void fly()
    {
System.out.println("Fly in the sky");
    }
 public static void main(String[] args) {
    Bird b=new Bird();
    b.sound();
    b.fly();
 }
}
