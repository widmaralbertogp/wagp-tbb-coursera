public class Main {    
    public static void main(String[] args) throws Exception 
    {
    
     /* 
      Example 1 without classes

        double weightInPounds1 = 154.0;
        double heightInInches1 = 70.0;
        double bmi1 = weightInPounds1 / (heightInInches1 * heightInInches1)* 703;

        double weightInPounds2 = 187.0;
        double heightInInches2 = 74.0;
        double bmi2 = weightInPounds2 / (heightInInches2 * heightInInches2)* 703;

        System.out.println("BMI of user 1: " + bmi1);
        System.out.println("BMI of user 2: " + bmi2);
    */ 
        BMICalculator bmiCalculator = new BMICalculator();

        double weightInPounds = 154.0;
        double heightInInches = 70.0;
        double bmiImperial = bmiCalculator.calculateBmiImperial(weightInPounds, heightInInches);

        double weightInKilos = 70.0;
        double heightInMeters = 1.82;
        double bmiMetric = bmiCalculator.calculateBmiMetric(weightInKilos, heightInMeters);

        System.out.println("BMI in Imperial System: " + bmiImperial); 
        System.out.println("BMI in Metric System: " + bmiMetric); 
    }
}