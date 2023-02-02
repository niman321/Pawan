public class Calculation {

    int x=10;
    int y=20;


    /*void sum(){
        System.out.println(x+y);
    }*/

   /* int sum(){
       return(x+y);
    }*/

   /* void  sum(int a,int b){
        System.out.println(a+b);
    }*/
   void sum(int a,int b){
       System.out.println(a+b);
   }




    public static void main(String[] args) {
        Calculation cal=new Calculation();
        //cal.sum();

        /*int res=cal.sum();
        System.out.println(res);
        System.out.println(cal.sum());*/
      //  cal.sum(100,200);
        cal.sum(100,200);

    }
}
