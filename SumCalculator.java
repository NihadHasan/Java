public class SumCalculator {
    void printSum(int a,int b)
    {
        System.out.println("Sum of integes:"+(a+b));
    }
    void printSum(long a,long b)

    {
       System.out.println("Sum of longs:"+(a+b));
    }
    public static void main(String[] args) {
        SumCalculator s=new SumCalculator();
        s.printSum(10, 5);
        s.printSum(100000000000L, 20);
    }
}
