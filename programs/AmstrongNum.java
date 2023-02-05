public class AmstrongNum{
    public static void main(String[] argumnents){
        // Amstrong number

        // 153
        // 1634

        int a = 153 ;
        int b = a;
        int c = a;
        int length = 0; // 3
        int total = 0;   // 152

        // String str = Integer.toString(a); // using pre-defined methods
        // String len = str.length();  

        while(b>0){  // 0 > 0
            b = b/10
            length = length+1 
        }


        for(int i = 0; i<length ; i++  ){
            int rem = c % 10; // 1
            int mul = rem * rem *rem ; //  1
            total = total + mul ;  // 27 + 125 = 152 , 152 + 1 = 153
            c = c/10; // 1/10
        }

        if(total == a ){
            System.out.println(a + " is the Amstrong number");
        }
        else{
            System.out.println(a + " is not a Amstrong number");
        }







    }
}