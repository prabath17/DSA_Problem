public class array_insertion1 {
    public static void main(String[] args){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int n = 5; // number of elements
        int pos = 2;
        int ele = 60;

        // Shift elements to the right
        for(int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[pos] = ele;
       // n++; // increase element count

        // Print the array
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
