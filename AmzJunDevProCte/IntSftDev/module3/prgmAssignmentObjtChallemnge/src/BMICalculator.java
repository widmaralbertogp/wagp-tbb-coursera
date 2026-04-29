// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos height in meters,
    double weightINpounds; 
    double heightINinches; 
    
    double weightINkilos; 
    double heightINmeters;

       
    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() 
    {
        weightINpounds = 0;
        heightINinches = 0;
        weightINkilos = 0;
        heightINmeters = 0;
    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weightINpounds, double heightINinches)
    {
        double bmiImperial = weightINpounds / (heightINinches * heightINinches) * 703;
        return bmiImperial;
    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weightINkilos, double heightINmeters) 
    {
        double bmiMetric = weightINkilos / (heightINmeters * heightINmeters);
        return bmiMetric;
    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) 
    {

        String bmiCategory;
        if (bmi < 18.5)
        {
            bmiCategory = "Underweight";
        }
        else if (bmi < 25) 
        {
            bmiCategory = "Normal weight";
        }
        else if (bmi < 30) 
        {
            bmiCategory = "Overweight";
        }
        else 
        {
            bmiCategory = "Obese";
        }
        return bmiCategory;
    }
}