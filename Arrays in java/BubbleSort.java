public class BubbleSort {
    public static void main(String[] args) {
        int num[] ={6,5,8,7,9,4};
        int size = num.length;
        int temp =0;
        System.out.println("Before sorting");
        for (int nums : num){
            System.out.print(nums+ " ");
        }

        for(int i=0 ;i<size ; i++){
            for(int j=0 ; j<size-i-1 ; j++){
                if(num[j]>num[j+1]){
                    temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int nums : num){
            System.out.print(nums+ " ");
        }
    }
}
