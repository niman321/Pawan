package Part2;

public class student {
    int sid;
    String sname;
    char sgrade;

    student(int id ,String name, char g){

    }
    void getValues(int id ,String name, char g){
        sid=id;
        sname=name;
        sgrade=g;

    }

    void  display(){
        System.out.println(sid+" "+sname+" "+sgrade);
    }
}
