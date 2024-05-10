public class Print3LargestNum {

    public static void printLargest(int arr[],int arr_size){
       int i,first,second,third;
       if(arr_size<3){
           System.out.println("Invalid Input");
       }
       first=second=third=Integer.MIN_VALUE;
       for(i=0;i<arr_size;i++){
           if(arr[i]>first){
               third=second;
               second=first;
               first=arr[i];
           }else if (arr[i]>second){
               third=second;
               second=arr[i];
           }else if (arr[i]>third){
               third=arr[i];
           }

       }
        System.out.println(first+" "+second+" "+third);
    }

    public static void main(String[]args){
        int arr[]={10,50,60,90,20,70};
        int n= arr.length;
        printLargest(arr,n);
    }
}
