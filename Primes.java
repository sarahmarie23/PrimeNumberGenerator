import java.util.ArrayList;
public class Primes {
    public static int GENERATEUPTO = 1000; //check the primes up to this number
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        for (int primeTest = 8; primeTest <= GENERATEUPTO; primeTest++) {
            boolean isItPrime = primeTest(primes, primeTest);
            if (isItPrime == true) {
                primes.add(primeTest);
            }
        }
        System.out.println(primes);
    }
    public static boolean primeTest(ArrayList<Integer> primes, int primeTest) {
        boolean test = true; 
        for(int index = 0; index < primes.size(); index++) {
            double divideByPrime = primes.get(index); 
            double check = primeTest/divideByPrime;
            if ((check == Math.floor(check)) && !Double.isInfinite(check)) {
                test = false;
                break;
            }   
        }
        return test;
    }
}