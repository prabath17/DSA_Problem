public class bubble_sort{
    public static void main(String[] args) {
    int[] arr = {8, 3, 19, 7, 15, 4, 1, 20, 11, 9, 6, 14, 5, 12};
    int j=arr.length-1;
    while(j!=0){
        for(int k=1;k<=j;k++ ){
            if (arr[k]<arr[k-1]){
                int temp=arr[k];
                arr[k]=arr[k-1];
                arr[k-1]=temp;
            }
        }
        j--;
    }
    for(int i: arr){
        System.out.print(i+" ");
    }
    }
}