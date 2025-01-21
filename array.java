package Q2;

public class array {
    int arr[][]= new int[5][5];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=1+j;
        }
    }
}
