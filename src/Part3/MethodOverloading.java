package Part3;

public class MethodOverloading {
    void add(int a , int b ){
        System.out.println(a+b);//1
    }
    void add(int a, double b){
        System.out.println(a+b);  //2
    }
    void add(double a,double b){
        System.out.println(a+b);  //3
    }
    void add(int a, int b, int c){
        System.out.println(a+b);//4
    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.add(10,20);
        mo.add(10,20,30);
        mo.add(10,20.5);
        mo.add(10.5,10.0);
    }

}
