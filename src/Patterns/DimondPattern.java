package Patterns;

public class DimondPattern {

    public static void main(String[] args) {
        int size = 10;
        for(int i = 1; i <= size*2-1; i++) 
            System.out.print("*");
    System.out.println();
    
    for(int i = 1; i <= size-1; i++) {
        System.out.print("*");
        
        for(int j = 1; j <= size-i-1; j++)
            System.out.print(" ");
            
        for(int j = 1; j <= 2*i-1; j++)
            System.out.print("*");
             
        for(int j = 1; j <= size-i-1; j++)
            System.out.print(" ");
            
        System.out.println("*"); 
    }
    
    for(int i = size-1; i >= 1; i--) {
        System.out.print("*");
        
        for(int j = 1; j <= size-i-1; j++)
            System.out.print(" ");
            
        for(int j = 1; j <= 2*i-1; j++)
            System.out.print("*");
            
        for(int j = 1; j <= size-i-1; j++)
            System.out.print(" ");
            
        System.out.println("*");
    }

    for(int i = 1; i <= size*2-1; i++)
        System.out.print("*");
    }
    
}
