package Recursion;
//Bubbile sort
/*public class SlectPractice {
    public static void main(String[] args) {
        int []arr = {1,2,3,41,12};
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
*/


//Selection sort
/*public class SlectPractice{
    public static void main(String[] args) {
        int []arr={23,12,1,3,4};
        for(int i=0;i<arr.length;i++){
            int smallest =i;

            for(int j =i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/

//Inseration sort
public class SlectPractice{
    public static void main(String[] args) {
        int []arr = {1,42,21,12,4};
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j =i;j>=0;j--){
                if(current<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=current;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
