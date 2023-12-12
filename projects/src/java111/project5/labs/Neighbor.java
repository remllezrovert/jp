package java111.project5.labs;

/** @author Trevor Zellmer */
public class Neighbor {
    String color;
    int size;
    /**
     * Default parameterless Neighbor constructor
     * Creates purple size 27 neighbor by default
     */
    Neighbor (){
        this.color = "Purple";
        this.size = 27;
    }

    /** @param newSize */
    Neighbor(int newSize){
        Neighbor n = new Neighbor();
        this.color = "Purple";
        this.size = newSize;
    }
    /** @param newColor */
    Neighbor(String newColor){
        Neighbor n = new Neighbor();
        this.color = newColor;
        this.size = 27;
    }
    /** 
     * Returns String with info about size and color
     * @return String */
    public String toString(){
        return "My " +  color + " neighbor is size " + size + ".";
    }

}
