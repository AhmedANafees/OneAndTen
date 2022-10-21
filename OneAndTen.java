import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class OneAndTen {
public static boolean OutsideMode(int num)
{
    boolean outsideMode = false;
    if(num >= 1 && num <= 10)
    {
    outsideMode = false;
    } 
    else
    {
    outsideMode = true;
    }
    return outsideMode;
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);        
System.out.println("Type in a number between 1 and 10: ");
int num = input.nextInt();
boolean value = OutsideMode(num);
if (value == false)
{
System.out.println("Thank you");
}
else
{
System.out.println("That number is not between 1 and 10");
}

    }
    
}
