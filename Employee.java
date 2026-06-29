 class Employee{
    private String name;
    private double salary;
    private String designation;
    private int age;

     Employee(String name,double salary,String designation,int age) {
        this.name=name;
        this.salary=salary;
        this.designation=designation;
        this.age=age;
    }

        public String getName()
        {
            return name;
        }
        public double  getSalary()
        {
            return salary;
        }
        public String getDesignation()
        {
            return designation;
        }
       public int getAge()
       {
          return age;
       }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public void setDesignation(String designation)
    {
        this.designation=designation;
    }
    public void setAge(int age)
    {
        this.age=age;
    }


public void printEmployee()
{
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("Designation:"+designation);
System.out.println("Age:"+age);

}
    
public static void main(String[] args) {
    Employee e=new Employee("Nihad", 20000, "Developer", 21);
    e.printEmployee();
}
 }
