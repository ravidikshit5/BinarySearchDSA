import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(nums1[i]==nums2[j]){
                    int[] sortedArray = new int[m+n];
                    for(int k=0;k<sortedArray.length-1;k++){
                        sortedArray[k]=nums1[i];
                        sortedArray[k+1] = nums2[j];
                        System.out.print(sortedArray[k]+" ");
                    }
                }else{
                    
                }
            }

        }

    }
    public static void main(String args[]){
        int[] nums1 = {7,2,1,9,4};
        int m=2;
        int[] nums2 = {10,2,5,9,1};
        int n=3;
        MergeSortedArray mer = new MergeSortedArray();
        mer.merge(nums1,m,nums2,n);
    }
}
