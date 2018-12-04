/*
 *Jessica Qiao
 *28/11/2018
 */

package data.validation.and.testing.data;
import java.util.Scanner;
/**
 *
 * @author jeqia0005
 */
public class DataValidationAndTestingData {
    
    
    public static void Stage1(String input1)
    {
        
        boolean valid = false;
        while(valid == false)
        {
            try
            {
                if(input1.length() > 6)
                valid = true;
                
            }
            catch (Exception e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }
        }

    }
    
    
    public static void Stage2(String input2)
    {
        
        boolean valid = false;
        while(valid == false)
        { try
            {
                
                if(input2.contains("a"))
                valid = true;
                
            }
            catch (Exception e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }
        }
    }
    
    
    public static void Stage3(String input3)
    {
        
        boolean valid = false;
        while(valid == false)
        { try
            {
                if(input3.contains("z") && input3.length()<5 && input3.length()>15)
                
                valid = false;
            }
            catch (Exception e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }
        }
    }
    
    
    public static void Stage4(int input4)
    {
        
        boolean valid = false;
        while(valid == false)
        {  try
            {
                if(input4 > 5 && input4 < 500)
                valid = true;
            }
            catch (Exception e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }
        }
    }
    
    
    public static void Stage5(int input5)
    {
        boolean valid = false;
        while(valid == false)
        { try
            {
                if(input5 < 0)
                valid = true;
            }
            catch (Exception e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }
        }
    }
    
   
    public static void Stage6(int input6)
    {
        boolean valid = false;
        while(valid == false)
        { try
            {
                if(input6 > 0 && input6 % 2 == 1)
                valid = true;
            }
            catch (Exception e)
            {
                System.out.println("Sorry, that is not valid input.");
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        String input1,input2,input3;
        int input4,input5,input6;
        
        
        System.out.println("Enter a string that is greater than 6 characters long");
            input1 = keyedInput.nextLine();
            System.out.println("");
            
        System.out.println("Enter a string that contains at least one lowercase “a”");
            input2 = keyedInput.nextLine();
            System.out.println("");
            
        System.out.println("Enter a string that is between 5 and 15 characters long, and does not contain the letter “z”");
            input3 = keyedInput.nextLine();
            System.out.println("");
            
        System.out.println("Enter an integer between 5 and 500");
            input4 = keyedInput.nextInt();
            System.out.println("");
            
        System.out.println("Enter a negative integer");
            input5 = keyedInput.nextInt();
            System.out.println("");
            
        System.out.println("Enter a positive, odd integer");
            input6 = keyedInput.nextInt();
            System.out.println("");
        
           Stage1(input1);
           Stage2(input2);
           Stage3(input3);
           Stage4(input4);
           Stage5(input5);
           Stage6(input6);
    }
    
}
