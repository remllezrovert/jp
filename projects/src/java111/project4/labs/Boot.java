/** @author Trevor Zellmer */
class Boot extends Footwear {
    private int height;
    private boolean spurs;

    /** @returns height */
    public int getHeight(){
        return height;
    }

    /** @param newHeight */
    public void setHeight(int newHeight){
        height = newHeight;
    }



    /** @returns spurs*/
    public boolean getSpurs(){
        return spurs;
    }

    /** @param newSpurs */
    public void setSpurs(boolean newSpurs){
        spurs = newSpurs;
    }

    public void show(){
    super.type = "boot";
    super.display();

    System.out.print( " It is "  + height + "\" high and " + ((spurs) ? "has spurs." : "does not have spurs."));

    }
}