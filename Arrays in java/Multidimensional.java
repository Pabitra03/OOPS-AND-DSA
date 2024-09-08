import java.util.Scanner;
public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Two dimensional array
         int num[][] = new int[3][4];
        System.out.println("Enter the values:- ");
         // Assigning the values 
         for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                int a = sc.nextInt();
                num[i][j] = a;
            }
         }

         // Accessing elememts
         for(int i=0; i<3 ; i++){
            for(int j=0; j<4 ; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
         }

         // Enhanced for loop
         for(int n[] : num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
         }
         sc.close();
         
    }
}
