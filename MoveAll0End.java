public class MoveAll0End {
    public static void moveALLZeroinLast(int arr[],int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < size) {
            arr[count++] = 0;
        }
    }
    public static void main(String[]args){
        int arr[]={2,3,0,5,1,0,0,6,0,2};
        int n= arr.length;
        moveALLZeroinLast(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
