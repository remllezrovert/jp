
/** @author Trevor Zellmer */
public class Footwear{
protected int size;
protected String color;
protected String brand;
protected String type = "shoe";

/** @return Brand */
public String getBrand(){
    return brand;
}
/** @param newBrand */
public void setBrand(String newBrand){
    brand = newBrand;
}
/** @return color */
public String getColor(){
    return color;
}
/** @param newColor*/
public void setColor(String newColor){
    color = newColor;
}
/** @return size */
public int getSize(){
    return size;
}
/** @param newSize*/
public void setSize(int newSize){
    size = newSize;
}
public void display(){
    System.out.print("The " + type + " is a " + color + ", size " + size + ", " + brand + "." );
    } 
}