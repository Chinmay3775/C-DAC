public class Q4 {
    public static void main(String[] args) {
         int[] arr= { 2, 7, 4, 0, 9, 5, 1, 3 };
         int  target = 6;
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target)
                    System.out.println("{ "+arr[i]+", "+arr[j]+", "+arr[k] +" }");
                }
            }
         }

    }
}
