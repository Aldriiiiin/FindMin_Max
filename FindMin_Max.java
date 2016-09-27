public class FindMin_Max {


    public static void main (String [] args)

    {
        
        int [] numbers = {18 , 53 , 35 , 13 , 17 , 99 } ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            
            for(int x = 0 ; x<numbers.length ; x++)

            {
                
                if(numbers[x] < min )
                {
                       min = numbers[x] ;
                }
                if(numbers[x] > max )
                {
                        max = numbers[x];
                }
                
             System.out.println("SMALLEST NUMBER is: " +min);
             System.out.println("LARGEST NUMBER is: " +max);
                
                
            }    
   }
        
}
