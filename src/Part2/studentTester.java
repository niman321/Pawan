package Part2;

public class studentTester {
    public static void main(String[] args) {
        student stu1=new student(1010,"nima",'A');

       /* stu1.sid=1010;
        stu1.sname="nima";
        stu1.sgrade='A';

        stu1.display(); */

        stu1.getValues(1010,"nima",'A');

        stu1.display();
    }
}
