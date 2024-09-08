public class LinearSearching {
    public static void main(String[] args) {
        int num[] = {5, 7 , 9 ,11 , 13};
        int target = 11;
        int result = linearSearch(num, target);
        if(result != -1){
            System.out.println("Element is present at index " + result);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int num[], int target){
        for (int i = 0; i < num.length; i++) {
            if(num[i] == target){
                return i;
            }
        }
        return -1; 
    }
}
