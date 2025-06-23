public class linear_search {
    public static void main(String[] args) {
        int[] arr = {8, 3, 19, 7, 15, 4, 1, 20, 11, 9, 6, 14, 5, 12};
        int target=100;
        boolean flag=true;
        for(int i: arr){
            if(i==target){
                System.out.println("target value is there in our array");
                flag=false;
            }
        }
        if(flag){
            System.out.println("target value isn't there in our array");
 
        }
    }
}
