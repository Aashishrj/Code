// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,9,11,16};
        int target=3;
        int v=floor(arr,target);
        System.out.println(v);
        
        
    }
    public static int floor(int arr[],int target)
        {
            int low=0;
            int high=arr.length-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
             if(arr[mid]<=target && arr[mid+1]>target)
             {
                 return mid;
             }
             
            else if(arr[mid]>target)
                {
                    high=mid-1;
                }
            else 
                {
                    low=mid+1;
                }
                 
                
            
            }
        return -1;
        }
}
