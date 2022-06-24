public class Main {
     private static int i;

    static void showSum(int i, int j, int k) {
    
         Main.i = i + j + k;
        int sum = Main.i;
         System.out.println(sum);
     }
   
     public static void main(String[] args) {
       Test test  = new Test ();
       test.showSum (5,4,8);
     }
     
   }
