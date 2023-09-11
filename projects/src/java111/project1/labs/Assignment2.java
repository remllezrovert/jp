
class CoffeeMaker{

    public void strongCoffee() {
        System.out.println("Brewing strong coffee! Can't you just smell it?");
    }

    public void weakCoffee() {
        System.out.println("Brewing weak coffee! Why would anyone do this?");
    }

}









class Assignment2{
    public static void main(String[] args) {
        CoffeeMaker danny = new CoffeeMaker();
        danny.strongCoffee();
        danny.weakCoffee();
    }
}
