import java.util.Scanner;
public class DeletionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();
        int num[] = new int[n];
        int num1[] = new int[n-1];

        System.out.println("Enter values:- ");
        for(int i=0; i<n ; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter index of value to be deleted:- ");
        int m =sc.nextInt();
        for(int j=0 ; j<num.length ;j++){
            if(j<m){
                num1[j] = num[j];
            }
            else if(j==m){
                continue;
            }
            else{
                num1[j-1] = num[j];
            }
        }

        System.out.println("Elements are:- ");
        for(int i=0 ; i<num1.length ; i++){
            System.out.println(num1[i]);
        }
    }
    
}
