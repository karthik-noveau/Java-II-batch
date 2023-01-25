public class SumOfDigit{
    public static void main(String[] args){
        // sum of Digit
        // a = 123 ;
         

         int num = 123; // 12, 1
         int result = 0; //3, 5, 6

        for(int i=1; i<=3; i++){// 1<=3 , 2<=3, 3<=3 , 4<=3
            int rem = num % 10 ; // 123%10=3, 12%10=2, 1
            result = result +rem ; // 0+3=3, 3+2=5 , 5+1=6
            num = num/10 ; // 12, 1, 1/10=0.1
        }

        System.out.println("result "+result);
    }
}