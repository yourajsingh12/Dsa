package dsa.arrays;

public class MoveZero {

    public static void main(String args[]){
        int arr[]={90,0,88,34,67,};
        int index=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] !=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;

                index++;
            }

        }
        System.out.print("After Remove Zero :-");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }


}
