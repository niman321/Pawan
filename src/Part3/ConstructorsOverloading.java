package Part3;

public class ConstructorsOverloading {

    ConstructorsOverloading(int a,int b){
        System.out.println(a+b);
    }
    ConstructorsOverloading(int a,double b){
        System.out.println(a+b);
    }
    ConstructorsOverloading(double a,int b){
        System.out.println(a+b);
    }
    ConstructorsOverloading(int a, int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ConstructorsOverloading co=new ConstructorsOverloading(10,20,30);

    }
}
