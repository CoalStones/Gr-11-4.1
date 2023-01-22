package ch4ex1;
import java.util.Scanner;
import java.lang.Math;
public class Ch4Ex1Resubmit {

    public static void main(String[] args) {
        double time,height,holder;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a time under 4.5 seconds.");
        time=input.nextDouble();
        input.close();
        
        holder=Math.pow(time,2);
        height=100-4.9*holder;
        
        System.out.format("The height of the object was %.2f",height);
        
    }
    
}
