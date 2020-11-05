package ro.fastrackit.classroom;

public class Algorithms {

    public static void main(String[] args) {
        int number = 6;
        int factorial = 1;
        for ( int i = 1; i<=number; i++) {
            factorial = factorial *i;
        }
        System.out.println("Factorial number for " + number + " is " + factorial );

    }

    public static class PrimeNumber {



        public static void main(String[] args) {
            int number = 51;
            boolean prime = false;
            for ( int i = 2; i<=number/2;++i) {
                if (number % i == 0) {

                    prime = true;
                    break;

                }

            }
                if (!prime)
                    System.out.println(number + " is a prime number.");
                else
                    System.out.println(number + " is not a prime number");



        }

    }

    public static class PrimeNumbersCount
    {
        public static void main (String[] args)
        {
            int i =0;
            int number =0;
            //Empty String
            String  primeNumbers = "";


            for (i = 1; i <= 200; i++)
            {
                int counter=0;
                for(number =i; number>=1; number--)
                {
                    if(i%number==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to 200 are :");
            System.out.println(primeNumbers);
        }
    }
}
