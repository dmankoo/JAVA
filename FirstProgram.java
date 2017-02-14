package com.fdmgroup1.firstproject;

/**
 * Hello world!
 *
 */
public class FirstProgram 
{
	
	
	public void task()
	{
	
	}
	
	
    public static void main( String[] args )
    {
        int intValue=2147483647;
        intValue++;
        System.out.println(intValue);
        
        float myFloat = (float)1.235456789012345/**f**/;
        /**Type casting forcing the f at the end as a float**/
        System.out.println("the float was "+myFloat);
        
        boolean myBoolean = true;
        System.out.println("my boolean is "+myBoolean);
        
        
        FirstProgram fp = new FirstProgram();
        fp.task();
        
        
    }
}
