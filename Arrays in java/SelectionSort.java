public class SelectionSort {
    public static void main(String[] args) {
        int num[] = {7,8,5,4,6,2};
        int size = num.length;
        int temp =0;
        int minIndex =-1;
        for(int i=0 ; i<size ; i++){
            minIndex = i;
            for(int j=i+1 ;j<size ; j++){
                if(num[minIndex] > num[j]){
                    minIndex = j;
                }
                
            }
            temp =num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
        for (int nums : num){
            System.out.print(nums+ " ");
        }
    }
}
