 
/**
 * Create a Body Mass Index (BMI) calculator by incorporating mainly the 
 * if-else-if statements, and the addition of parsing statements, string
 * values, double values, variable definements, and basic print statements.
 *
 * @author Anish Gupta
 * @version 2/22/21
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        double feetToMeters = 3.281;      // Conversion between feet to meters
        double poundsToKilograms = 2.205; // Conversion between pounds to kilograms
        String weightStatus = "";
        Scanner in = new Scanner(System.in);
        
        // Gather input0
        System.out.print("Enter your name (first last): ");
        String fullName = in.nextLine();
        System.out.print("Enter your height in feet and inches (e.g. 6 1): ");
        String feetHeight = in.next();
        String inchesHeight = in.nextLine();
        System.out.print("Enter your weight in pounds (e.g. 210): ");
        double weightInPounds = in.nextDouble();
        System.out.println();
        
        // Convert hieght in feet and inches to hieght in meters
        double doubleValueOffeetHeight;   // String converted to double
        double doubleValueOfinchesHeight; // String converted to double
        double inchesInFoot = 12;         // Inches in a foot
        doubleValueOffeetHeight = Double.parseDouble(feetHeight);
        doubleValueOfinchesHeight = Double.parseDouble(inchesHeight);
        double metersHeight = ((doubleValueOffeetHeight + (doubleValueOfinchesHeight / inchesInFoot)) / feetToMeters);

        // Convert weight in pounds to weight in kilograms
        double weightKilograms = weightInPounds / poundsToKilograms;

        // Calculate BMI
        double BMI = weightKilograms / (metersHeight * metersHeight);
        
        // Determine weight status
        if(BMI < 18.5)
            weightStatus = "Underweight";
        else if(BMI <= 24.9)
            weightStatus = "Normal or Healthy Weight";
        else if(BMI <= 29.9)
            weightStatus = "Overweight";
        else
            weightStatus = "Obese";
        
        // Print output
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + fullName);
        System.out.println("Height (m) " + metersHeight);
        System.out.println("Weight (kg): " + weightKilograms);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + weightStatus);
    }
}
