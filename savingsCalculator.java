import java.time.Year;

public class savingsCalculator {


      static void thePresident(){
        int q = 5;
        int w= 10;
        System.out.println("I am the president: " +q*w);
    }
    static void salim(){
          String name="salim";
          int age=23;
          String gender="male";

        System.out.println("the person intel is "+
                "\n name: "+ name+
                "\n age: "   + " " +age +
                "\n gender: " + gender);

    }




        public static void main(String[] args) {
     salim();
        thePresident();
            // Savings amount per day
//            double savingsPerDay = 100.0;
//
//            // Get the current year
//            int year = Year.now().getValue();
//
//            // Calculate the number of days in the year
//            int daysInYear = Year.of(year).length();
//
//            // Calculate the cumulative savings
//            double cumulativeSavings = savingsPerDay * daysInYear;
//
//            // Print the result
//            System.out.println("Cumulative savings for year " + year + ": $" + cumulativeSavings);


            // creating a program that calculates the cumulative amount saved in a year
            // corresponding with the number of days in a year
//
//            int savings = 0;
//            int days ;

//            for (days = 1; days<=365;days++){
//                savings = savings+days;
//                System.out.println("Amount saved on day "+days+" is: Kshs "+savings);
//
//            }
//
//            int amount = 200;
//            int day = 365;
//            int totalAmount;
//
//            totalAmount = day * amount;
//            System.out.println("the amount saved at the end of the year will be: $"+totalAmount);



        }
    }


