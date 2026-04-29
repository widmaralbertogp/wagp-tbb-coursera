public class CurrencyConversion {
    public static void main(String args[]) {

       // TODO  your code here
       double amountInUSD = 100.0;
       double exchangeRateUSDToEUR = 0.85;
 
       System.out.println("Initial Amount : " + amountInUSD );
        // Adding 10 more items

        amountInUSD *= exchangeRateUSDToEUR;

        System.out.println("Amount in EUR after conversion: " + amountInUSD);
        amountInUSD -= 55;                    
        System.out.println("Amount in EUR after expenditure: " + amountInUSD);       
        amountInUSD /= exchangeRateUSDToEUR;
        System.out.printf("Amount in USD after converting back: %.2f ",amountInUSD); 
    }
}
