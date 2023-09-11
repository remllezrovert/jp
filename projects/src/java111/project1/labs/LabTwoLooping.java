
class LabTwoLooping {
    /**
     * This is the main method for this class 
     * which will loop 13 times outputting the counter and its square
     * 
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;
        int counterSquared;
        while (counter < 13 ){
            counterSquared = counter * counter;
            System.out.println(counter + " " + counterSquared);
            counter += 1;
        }
    }
}