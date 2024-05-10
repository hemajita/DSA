import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int arr[]={6,8,2,3,1,5,4,2,7,9};
        /* using java 8
        Arrays.sort(arr);
        for (int num:arr){
            System.out.println(num);
        }*/
      sort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void sort(int[] arr){
int i=0;
while (i< arr.length){
    int correct=arr[i]-1;
    if (arr[correct]!=arr[i]){
        swap(arr,i,correct);
    }else {
        i++;
    }
}
    }
}
