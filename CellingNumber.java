public class CellingNumber {
    static int cellingNumber(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target>arr[i]&&target<arr[i+1]){
                return arr[i+1];
            }
        }



      return -1;
    }
    public static void main(String args[]){
        int[] arr={1,5,14,21,29,32,38};
        int target = 34;
        int ce = cellingNumber(arr,target);
        System.out.println(ce);

    }
}
