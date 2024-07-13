public class BinarySearchJava {
    static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){ //That means the target element will lie left of the mid element so, we decrease the end
              //and our end becomes arr[mid-1]
              end = mid-1 ;
            } else if (target>arr[mid]) { //That means the target element will lie right of the mid element so,
                //We increment our start to mid+1
                start = mid+1;
            }else {
                return mid;
            }
        }
    return -1;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int bin = binarySearch(arr,target);
        System.out.println(bin);
    }
}
