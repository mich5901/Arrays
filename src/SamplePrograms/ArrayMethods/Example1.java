package SamplePrograms.ArrayMethods;

public class Example1 {
    
    public static void main(String[] args) {
      int abc[] = {45, 433, 67, 87, 121};
      changeTo10(abc);
      
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + ", ");
        }
    }
    
    public static void changeTo10(int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i] = 10;
        }
    }
    
    
}
