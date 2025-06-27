public class array_deletion2 {
        public static void main(String[] args){
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int pos=2;
        
        boolean lamp=false;
        for(int i=0;i<arr.length-1;i++){
            if(i==pos-1){
                lamp=true;
            }
            
            if(lamp){
                arr[i]=arr[i+1];
            }
        }
        for(int i:arr){
            System.out.println(i);
        }

    }
}
