public class sort{

   public static void main(String[] args){


    int[] numbers = new int[]{5,8,6,4,7}; // 4, 5, 6, 7, 8
    int len = numbers.length;

    for(int i=0; i<len; i++){    // 0

         for(int j=i+1; j<len; j++){   // 3
             if(numbers[i]>numbers[j]) // 5>4
             { 
               int temp = numbers[i];  //  temp = 5
               numbers[i] = numbers[j];  // 5=4
               numbers[j] = temp;  // 4=5

             } 
         }

    }

    for(int i=0; i<len; i++){
      System.out.print(numbers[i] +" ");
    }

    System.out.println("");

    System.out.println("second minimum value is : " + numbers[1]);
    System.out.println("second maximum value is : " + numbers[len-2]);  //5-2



   }
}