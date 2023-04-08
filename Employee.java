/*
 1.do data hiding of all properties of emp class 
 2.eid only readable, sal should only modify of new sal is greater than old sal
 3.create Employee main class
 4.Design a method which accept emp details and show details of emp
 5.Display count of total emp 
*/ 
package oops.Employee_Project_1;
class Emp
{
    private String name;
    private int eid;
    private double sal;
    private String designation;
    static int count=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

//    public void setEid(int eid) {
//        this.eid = eid;
//    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        if (sal>this.sal) {
            this.sal = sal;
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    Emp(String name,int eid,double sal,String designation)
    {
        count++;
        this.name=name;
        this.eid=eid;
        this.sal=sal;
        this.designation=designation;
    }



}

class Dev extends Emp {
    Dev(String name, int eid, double sal, String designation) {
        super(name, eid, sal, designation);
    }
    public void code()
    {
        System.out.println("devloper write code");
    }
}

class Te extends Emp
{
    Te(String name, int eid, double sal, String designation) {
        super(name, eid, sal, designation);
    }
    public void test()
    {
        System.out.println("TE is Testing");
    }

}

class Hr extends Emp
{
    Hr(String name, int eid, double sal, String designation) {
        super(name, eid, sal, designation);
    }

    public void hire()
    {
        System.out.println("HR is Hiring");
    }
}

public class Employee {
    public static void main(String[] args) {
        Dev e1=new Dev("jeel",101,80000.0,"Devloper");
        Te e2= new Te("smit",102,90000.0,"Test Engineer");
        Hr e3=new Hr("jency",103,60000.0,"HR");
        Dd(e1);
        Dd(e2);
        Dd(e3);
        System.out.println("total employee is : "+Emp.count);

    }
    public static void Dd(Emp e)
    {
        System.out.println("name is: "+e.getName());
        System.out.println("eid is: "+e.getEid());
        System.out.println("sal is: "+e.getSal());
        System.out.println("designation is : "+e.getDesignation());
        if (e instanceof Dev)
        {
            ((Dev)e).code();
        } else if (e instanceof Te) {
            ((Te)e).test();

        } else if (e instanceof Hr) {
            ((Hr)e).hire();
        }
        System.out.println("-----------------------------------------------------");
    }
}
