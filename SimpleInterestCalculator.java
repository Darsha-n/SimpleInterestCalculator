public class SimpleInterestCalculator{

    public static double CalculateSimpleInterest(double principal , double rate , double time) {
        return(principal*rate*time)/100;
    }
    public static void main(String[]args){

        double principal = 10000;
        double rate = 8;
        double time = 4;

        double interest = CalculateSimpleInterest(principal, rate, time);
        System.out.println("Principal:"+ principal);
        System.out.println("Rate:"+ rate);
        System.out.println("Time:"+ time);
        System.out.println("SimpleInterest:"+ interest);
    }
}
