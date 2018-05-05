public class Potatoes {
    public static int potatoes(int initialWaterPercent, int initialMass, int finalWaterPercent) {
        double dryMass = (initialMass*((100 - initialWaterPercent)/100.0));
        double finalDryMassPercent = (100-finalWaterPercent) / 100.0;
        double finalMass = dryMass / finalDryMassPercent;

        System.out.println(dryMass);
        System.out.println(finalDryMassPercent);
        return (int)finalMass;

    }
}


//    int parameter p0 - initial percent of water-
//        int parameter w0 - initial weight -
//        int parameter p1 - final percent of water -
//        potatoesshould return the final weight coming out of the oven w1 truncated as an int.
//  finalmass = drymass/final dry mass percent