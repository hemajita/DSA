public class PrintSecondLargest {
    public static void printSecLargest(int arr[],int arr_Size){
//int first,second;
//if (arr_Size<2){
//    System.out.println("invalid input");
//}
//first=second=Integer.MIN_VALUE;
//for (int i=0;i<arr_Size;i++){
//    if(arr[i]>first){
//      second=first;
//      first=arr[i];
//
//    } else if (arr[i]>second && arr[i]!=first) {
//        second=arr[i];
//    }
//
//}
//        System.out.println(second);
//    }
int i,second,largest;
if (arr_Size<2){
System.out.println("Invalid input");
}
largest=second=Integer.MIN_VALUE;
for (i=0;i<arr_Size;i++){
   largest=Math.max(largest,arr[i]);
}
for (i=0;i<arr_Size;i++){
    if(arr[i]!=largest) {
        second=Math.max(second,arr[i]);
    }
}
//System.out.println(largest);
System.out.println(second);
    }
    public static void main(String[] args){
int arr[]={20,90,100,50,30};
int n= arr.length;
printSecLargest(arr,n);
    }
}
