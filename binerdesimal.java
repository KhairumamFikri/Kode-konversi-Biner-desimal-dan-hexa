
package kuliah;

import java.util.Scanner;

public class binerdesimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int n, x = 0;
        
        if (b%10 == 1){
            n = 1;
            x += n;
        }
        b /= 10 ; 
        if (b%10 == 1){
            n = 2;
            x += n;
        }
        b /= 10 ;   
        if (b%10 == 1){
            n = 4;
            x += n;
        }
        b /= 10 ;    
        if (b%10 == 1){
            n = 8;
            x += n;
        }
        b /= 10 ;
        if (b%10 == 1){
            n = 16;
            x += n;
        }
        b /= 10 ;
        if (b%10 == 1){
            n = 32;
            x += n;
        }
        b /= 10 ;
        if (b%10 == 1){
            n = 64;
            x += n;
        }
        b /= 10 ;
        if (b%10 == 1){
            n = 128;
            x += n;
        }
        b /= 256 ;
        if (b%10 == 1){
            n = 2;
            x += n;
        }
        b /= 10 ;
        System.out.println("Desimal : "+ x);
    }
    
}
