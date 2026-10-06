package dsa;

public class Practice {
   public static void main(String args[]){

      int arr[]={56,90,78,90,900};
      int largest=Integer.MIN_VALUE;
      int secondLargest=Integer.MIN_VALUE;

      for(int i=0;i<arr.length;i++){

         if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
         }

      }

   }
}
