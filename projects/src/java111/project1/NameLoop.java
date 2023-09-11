

public class NameLoop{
    String fullName;
    int loopCounter = 7;

    public void looper(String fullName, int loopCounter){
        while(loopCounter > 0 ){
            System.out.println(fullName);
            loopCounter -= 1; 
        }
    }
}