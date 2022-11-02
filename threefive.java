class threefive
{  
    public static void main(String args[])   
    {   
        int n=100;  
        System.out.print("List of  numbers from 1 to 100: \n");  
        for (int i=1; i<=n; i++)   
        { if (i%3 == 0&& i%5==0) {
            System.out.print( "threefive ");
            
        } 
            if (i%3 == 0) {
                System.out.print( "three ");
                
            } 
            else if (i%5 == 0) {
                System.out.print("five ");
           
            }else if ( i == i )
            {
                System.out.print(i + " ");
            }
        }
    }  
}