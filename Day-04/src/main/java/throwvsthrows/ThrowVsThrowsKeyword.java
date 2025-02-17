package throwvsthrows;
public class ThrowVsThrowsKeyword {
    public static void main(String[] args) {
        //method call
        double result = calculateInterest(-1000, 2, 2);
        System.out.println("Calculated intrest: " + result);
    }
    //method to calculate intrest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        //throws claim the method might throw illegal argument exception
        double interest = 0;
       try{
           if (amount < 0 || rate < 0){
               //explicitly throw the exception
               throw new IllegalArgumentException("Invalid input : Amount and rate must be positive");
           }
           //return intrest
           interest = (amount * rate * years)/100;
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
        return interest;
    }
}
