public class WhileLoops {
    public static void main(String[] args) {
        while1();
        String str = "Jevit";
        iterateOverStringWithForLoop(str);
        iterateOverStringWithWhileLoop(str);
    }
    private static void while1(){
        //Given an integer age is equal to 0.
        //Create a while loop that increments age by 1 and prints it to the console.
        // whlie age is less than 100
        int age = 0;
        while (true){
            age ++;
            System.out.println(age);
            if (age == 100) {
                break;
            }
        }

    }

    private static void iterateOverStringWithForLoop(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    private static void iterateOverStringWithWhileLoop(String str) {
        int counter = 0;
        while (counter < str.length()) {
            System.out.println(str.charAt(counter));
            counter++;
        }
    }

}
