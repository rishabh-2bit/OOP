package Patterns;

public class DiamondPattern {

    public static void main(String[] args) {
        // boolean status = true;
        // for (int j = 0;j <= 10; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     for (int j = 0;j < 10; j++){
        //         System.out.println("*         *");
        //     }
        //   for (int j = 0;j <= 10; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        for (int j = 0;j < 20; j++){
                System.out.print("*");
            }
            System.out.println();
            for(int i=0; i < 10 ; i++){
                for (int j = 0; j < 20; j++) {
                    if(j== 0 || j == 19){
                        System.out.print("*");
                    } else System.out.print(" "); 
                }
                System.out.println();
            }
            for (int j = 0;j < 20; j++){
                System.out.print("*");
            }
             System.out.println();
        }
        
    }
    

