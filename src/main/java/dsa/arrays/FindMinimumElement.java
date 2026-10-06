package dsa.arrays;

public class FindMinimumElement {

    public static void main(String args[]){

        int arr[]={89,65,90,33};
        int max=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("Min Number :- "+max);
    }

}
