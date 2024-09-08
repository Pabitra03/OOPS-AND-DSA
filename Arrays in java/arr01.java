import java.util.Scanner;
class arr01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating an array by first method
        //int arr[] = {1,8,9,4};
        //System.out.println("Array elements using first method: "+ arr[0]);

        // Second way...
        int arr[] = new int[5];

        //arr[0]=1;
        //arr[1]=2;
        //arr[2]=3;
        //arr[3]=4;
        //arr[4]=5;

        // assigning values using for loop..
        for(int i=0;i<5;i++){
            System.out.println("Enter the value for "+ i + " index:- ");
            int a = sc.nextInt();
            arr[i] = a;
            
        }

        //  printing array elements using for loop

        for(int j=0; j<arr.length; j++){
            System.out.println("Array elements using second method: "+ arr[j]);
        }
        sc.close();
    }
}