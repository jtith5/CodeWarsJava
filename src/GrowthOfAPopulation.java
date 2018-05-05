public class GrowthOfAPopulation {
    public static int nbYear(int initialPop, double percent, int aug, int targetPop) {
        percent = percent/100;
        double instantpop = 0.00;
        double lastYearPop =initialPop;
        int numberOfYears = 0;




//        while (lastYearPop < targetPop) {
//            numberofYears++;
//            lastYearPop = calculateNextYearPop(percent, aug, lastYearPop);
//            System.out.println(numberofYears + ") " + lastYearPop);
//            System.out.println("Is last year pop (" + lastYearPop + ") less than targetPop(" + targetPop + ")");
//            System.out.println("If true then keep looping!");
//        }

        for (numberOfYears = 0; lastYearPop < targetPop; numberOfYears++) {
            lastYearPop = calculateNextYearPop(percent, aug, lastYearPop);
            System.out.println(numberOfYears + ") " + lastYearPop);
            System.out.println("Is last year pop (" + lastYearPop + ") less than targetPop(" + targetPop + ")");
            System.out.println("If true then keep looping!");
        }

return numberOfYears;

    }
    public static double calculateNextYearPop( double percent, int aug, double lastYearPop){
       double currentpop = 0.00;
        currentpop = lastYearPop*(1 + percent) + aug;

        return currentpop;
    }
}

