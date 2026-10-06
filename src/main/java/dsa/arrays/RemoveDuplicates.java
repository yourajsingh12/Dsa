package dsa.arrays;

public class RemoveDuplicates {

    public static void main(String args[]){

        int arr[]={11,11,89,56,3,0,0,56,22,22};
        int index=1;

        for(int i=1;i<arr.length;i++){

            if(arr[i] != arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }

        System.out.print("After Remove Duplicates :-");
        for(int i=0;i<index;i++){
            System.out.print(" "+arr[i]);
        }

    }

}
