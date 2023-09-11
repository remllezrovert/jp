class Assignment1Part2{
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 20 ){
            if (counter == 0) {
                System.out.println(counter + " First Time!");
            }
            if (counter == 9) {
                System.out.println(counter + " Half-way there!");
            }
            if (counter == 19) {
                System.out.println(counter + " All done!");
            }
            if (counter != 0 && counter != 9 && counter != 19){
                System.out.println(counter);
            }
            counter += 1;
        }
    }
}