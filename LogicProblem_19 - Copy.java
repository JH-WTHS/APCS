
/**
 * 
 *   Given an 8 digit binaryNum, change it into HEX.
 *   Rem: HEX is read "4 bits at a time".  So pull off the first 4,
 *        then the last 4, and convert them over.
 */

public class LogicProblem_19
{
    public static void main()
    {
    int binaryNum = 10011101;
    int firstBinaryPart, lastBinaryPart;
    int firstBinaryPartCopy, lastBinaryPartCopy;    
    int firstBinarySum, lastBinarySum;
    int power=1;
    int digit;
    
        firstBinaryPart = binaryNum/10000;
        lastBinaryPart = binaryNum%10000;
    
        firstBinaryPartCopy = firstBinaryPart;
        firstBinarySum = 0;
        power = 1;
        while (firstBinaryPartCopy > 0) {
            digit = firstBinaryPartCopy % 10;
            firstBinarySum += digit * (int) Math.pow(2,power-1);
            power++;
            firstBinaryPartCopy /= 10;
        }
        
        lastBinaryPartCopy = lastBinaryPart;
        lastBinarySum = 0;
        power = 1;
        while (lastBinaryPartCopy > 0) {
            digit = lastBinaryPartCopy % 10;
            lastBinarySum += digit * (int) Math.pow(2,power-1);
            power++;
            lastBinaryPartCopy /= 10;
        }             
        
        System.out.println( binaryNum + " broken into hex: ");   
        
        System.out.print(" firstBinaryPart = " + firstBinaryPart + " = ");                                       
        if (firstBinarySum <= 9)
            System.out.print(firstBinarySum);
        else if (firstBinarySum == 10)
            System.out.print("A");
        else if (firstBinarySum == 11)
            System.out.print("B");
        else if (firstBinarySum == 12)
            System.out.print("C");
        else if (firstBinarySum == 13)
            System.out.print("D");
        else if (firstBinarySum == 14)
            System.out.print("E");
        else if (firstBinarySum == 15)
            System.out.print("F");
        System.out.println(" in hex");
            
        System.out.print(" lastBinaryPart = " + lastBinaryPart + " = ");               
        if (lastBinarySum <= 9)
            System.out.print(lastBinaryPart);
        else if (lastBinarySum  == 10)
            System.out.print("A");
        else if (lastBinarySum  == 11)
            System.out.print("B");
        else if (lastBinarySum  == 12)
            System.out.print("C");
        else if (lastBinarySum  == 13)
            System.out.print("D");
        else if (lastBinarySum  == 14)
            System.out.print("E");
        else if (lastBinarySum  == 15)
            System.out.print("F");  
        System.out.println(" in hex");            
    }


}
