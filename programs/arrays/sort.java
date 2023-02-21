public class sort{

   public static void main(String[] args){


    int[] ages = new int[]{5,8,6,4,7}; // 4, 5, 6, 7, 8
    int len = ages.length;

    for(int i=0; i<len; i++){  // 5
  
         System.out.println("---first for loop"); // 5

         for(int j=i+1; j<len; j++){  // 4+3+2
            System.out.println("second for loop");  // 9
         }

    }



   }
}