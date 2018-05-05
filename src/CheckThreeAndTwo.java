public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
       for (int i = 0; i < chars.length; i++){
           if (chars[i] == 'a'){
               aCounter ++;
           }
           else if (chars[i] == 'b'){
               bCounter ++;
           }
           else cCounter ++;
       }
        System.out.println("A = " + aCounter + "\nB = " + bCounter + "\nC = " + cCounter);

       if (aCounter == 3 && (bCounter == 2 || cCounter == 2)){
           return true;
       }
       else if (bCounter == 3 && (aCounter ==2 || cCounter ==2)){
           return true;
       }
       else if (cCounter == 3 && (aCounter ==2 || bCounter ==2)){
           return true;
       }
       else return false;
    }

}
