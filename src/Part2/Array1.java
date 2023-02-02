package Part2;

public class Array1 {
    public static void main(String[] args) {
        int []a={100,200,300,400,500};
        System.out.println(a[3]);

        for (int i = 0; i <=a.length-1; i++) {
            System.out.print(a[i]+" ");

        }
        for (int i:a){
            System.out.println(i);
        }



    }
}
