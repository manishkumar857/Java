package Recursion;

public class firstoccur {
    public static int fo(int arr[],int key,int i){
        if(i==arr.length)
        {
            return -1;
        }

        if(arr[i]== key)
        {
            return i;
        }
        return fo(arr, key,i+1);

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,3,4};
        System.out.println(fo(arr,4, 0));
         
    }
}
