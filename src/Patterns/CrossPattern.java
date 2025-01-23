package Patterns;

public class CrossPattern {

    public static void main(String[] args) {
        // for (int j = 0;j < 20; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     for(int i=0; i < 10 ; i++){
        //         for (int j = 0; j < 20; j++) {
        //             if(j== 0 || j == 19){
        //                 System.out.print("*");
        //             } else System.out.print(" "); 
        //         }
        //         System.out.println();
        //     }
        //     for (int j = 0;j < 20; j++){
        //         System.out.print("*");
        //     }
        //      System.out.println();

        int size = 10;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
               if(i == 0 || i == size-1)
                   System.out.print("*");
               else  if (j == 0 || j == size-1) {
                   System.out.print("*");
               }else if(i == j || i == size-1-j){
                    System.out.print("*");
               }  else
                   System.out.print(" ");
        }
        System.out.println();
   }
 }
        
}
    

