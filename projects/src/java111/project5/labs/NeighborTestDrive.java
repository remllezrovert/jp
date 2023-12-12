package java111.project5.labs;

public class NeighborTestDrive {
    public static void main(String[] args){
        Neighbor n1 = new Neighbor();
        Neighbor n2 = new Neighbor(3);
        Neighbor n3 = new Neighbor("Turquoise");
        System.out.println(
        "Results from the default constructor\n"
        + n1.toString() + "\n\n"
        + "Results from the size constructor\n"
        + n2.toString() + "\n\n"
        + "Results from the color constructor\n"
        + n3.toString()
        );
    }
}
