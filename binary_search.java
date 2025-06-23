
import java.util.Arrays;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {8, 3, 19, 7, 15, 4, 1, 20, 11, 9, 6, 14, 5, 12};
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int target=140;
        boolean flag=true;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                System.out.println("target value is there in our array");
                flag=false;
                break;
            }
            else if (arr[mid]<target){
                i=mid+i;
            }
            else{
                j=j-mid;
            }

        }
        if(flag){
            System.out.println("target value isn't there in our array");

        }
    }
}
