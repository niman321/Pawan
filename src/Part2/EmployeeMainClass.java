package Part2;

public class EmployeeMainClass {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.eid=101;
        emp1.ename="nima";
        emp1.sal=250000;
        emp1.depart=10;
        emp1.job="manager";
        emp1.display();


        Employee emp2=new Employee();
        emp1.eid=111;
        emp1.ename="niman";
        emp1.sal=2500000;
        emp1.depart=14;
        emp1.job="boss";
        emp1.display();
    }

}
