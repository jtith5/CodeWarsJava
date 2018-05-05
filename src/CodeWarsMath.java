public class CodeWarsMath {
    public int nearestSq(int n) {
        //find the closest square that is beneath n.
        //find the closest square that is above n.

        int closestSquareBeneathN = n;
        int closestSquareAboveN = n;

         while (!isWholeNumber(Math.sqrt(closestSquareBeneathN))) {
             closestSquareBeneathN--;
         }

         while (!isWholeNumber(Math.sqrt(closestSquareAboveN))) {
             closestSquareAboveN++;
         }

        System.out.println("Closest square beneath n = " + closestSquareBeneathN);
        System.out.println("Closest square above n = " + closestSquareAboveN);

        if (n - closestSquareBeneathN < closestSquareAboveN - n)
            return closestSquareBeneathN;
        return closestSquareAboveN;
        // squared = (root)^(1/2)

    }

    public boolean isWholeNumber(double number) {
        return number == Math.floor(number);
    }
}
