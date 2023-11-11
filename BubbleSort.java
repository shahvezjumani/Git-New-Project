package SortingAlgorithms;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3,1,2,-3,43,-100};
        sort(arr);
    }
    public static void sort(int [] arr){
        for(int i=0;i< arr.length - 1;i++){
            for(int j=1;j< arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

