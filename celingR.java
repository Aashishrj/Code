// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      int arr[]={2,3,5,9,14,16,18};
      int target=15;
      int v=celing(arr,target);
      System.out.println(v);
    }
    public static int celing(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}
