
package java111.project4;
import java.util.ArrayList;
/** @author Trevor Zellmer */
public class SchoolTestDrive {
    public static void main(String[] args){
    ArrayList<Student> school = new ArrayList<Student>();

    Kindergartner k1 = new Kindergartner(1, "Greg Heffley");
    k1.setHomeRoomTeacher("Slobodan Milošević");
    ArrayList<String> activities = new ArrayList<String>();
    activities.add("Legos");
    activities.add("Arson");
    activities.add("Terrorism");
    k1.setActivities(activities);
    k1.setShowAndTell("Legos");
    school.add(k1);

    Kindergartner k2 = new Kindergartner(2, "Rowley Jefferson");
    k2.setHomeRoomTeacher("Aleister Crowley");
    ArrayList<String> activities2 = new ArrayList<String>();
    activities2.add("Inconspicuous paddle");
    activities2.add("Flagellation");
    activities2.add("Flatulation");
    k2.setActivities(activities2);
    k2.setShowAndTell("a confusing apparatus");
    school.add(k2);

   ElementarySchooler e3 = new ElementarySchooler(3, "Chrysanthemum Guggenheim");
    ArrayList<String> degrees = new ArrayList<String>();
    degrees.add("Scrum turbo-cognition");
    degrees.add("Gigastructural Oscillations");
    degrees.add("Subaqueous Wickerwork");
    e3.setDegrees(degrees);
    e3.getTestResults();
    school.add(e3);

   ElementarySchooler e4 = new ElementarySchooler(4, "Atticus Rothschild");
    ArrayList<String> degrees2 = new ArrayList<String>();
    degrees2.add("Ho-Chi-Mihn Thought");
    degrees2.add("Trancendental Metaphysics");
    degrees2.add("Porpoise Linguistics");
    e4.setDegrees(degrees2);
    school.add(e4);

    MiddleSchooler m5 = new MiddleSchooler(5, "Fregley");
    m5.setFeetThick(0);
    school.add(m5);

    MiddleSchooler m6 = new MiddleSchooler(6, "Gothmog Balrog");
    m6.setFeetThick(7);
    school.add(m6);

    HighSchooler h7 = new HighSchooler(7, "Rodrick Heffley");
    h7.setSmell("Grandpa's ointment");
    school.add(h7);

    HighSchooler h8 = new HighSchooler(8, "Heather Hills");
    h8.setSmell("Slim-Jim residue");
    school.add(h8);

//school.forEach(i -> {System.out.println(i.progressReport() + "\n");});


//Basic tests
    System.out.print("Kindergartner test 1: ");
    if (school.get(0).progressReport().equals(
    "Greg Heffley has a student id of 1\n"  + 
    "Greg Heffley's homeroom teacher is Slobodan Milošević\n" +
    "Greg Heffley's extracurricular activities include, Legos, Arson, Terrorism\n" +
    "Greg Heffley is a kindergarten student and brought Legos for show and tell.")) {
        System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Kindergartner test 2: ");
    if (school.get(1).progressReport().equals(
    "Rowley Jefferson has a student id of 2\n" + 
    "Rowley Jefferson's homeroom teacher is Aleister Crowley\n" +
    "Rowley Jefferson's extracurricular activities include, Inconspicuous paddle, Flagellation, Flatulation\n" +
    "Rowley Jefferson is a kindergarten student and brought a confusing apparatus for show and tell."
    )){

    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Elementary test 1: ");
    if (school.get(2).progressReport().equals(
    "Chrysanthemum Guggenheim has a student id of 3\n" +
    "Chrysanthemum Guggenheim has college degrees in, Scrum turbo-cognition, Gigastructural Oscillations, Subaqueous Wickerwork"
    )){
    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Elementary test 2: ");
    if (school.get(3).progressReport().equals(
    "Atticus Rothschild has a student id of 4\n" +
    "Atticus Rothschild has college degrees in, Ho-Chi-Mihn Thought, Trancendental Metaphysics, Porpoise Linguistics"
    )){
    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Middle test 1: ");
    if (school.get(4).progressReport().equals(
    "Fregley has a student id of 5\n" +
    "Fregley is 0 feet thick."
    )){
    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Middle test 2 : ");
    if (school.get(5).progressReport().equals(
        "Gothmog Balrog has a student id of 6\n" +
        "Gothmog Balrog is 7 feet thick."
    )){
    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Highschool test 1: ");
    if (school.get(6).progressReport().equals(
    "Rodrick Heffley has a student id of 7\n" +
    "Rodrick Heffley smells like Grandpa's ointment"
    )){
    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    System.out.print("Highschool test 2: ");
    if (school.get(7).progressReport().equals(
    "Heather Hills has a student id of 8\n" +
    "Heather Hills smells like Slim-Jim residue"
    )){
    System.out.print("Test Passed\n");
    } else System.out.print("Test Failed\n");

    //Test test
System.out.print("Elementary test test: ");
String[] t1 = {"Chrysanthemum Guggenheim", "To seek the Holy Grail.", "Yellow"};
e3.setTestInput(t1);
e3.takeTest();
System.out.print((e3.getTestResults().equals("3/3")) ? "Test Passed\n" : "Test Failed\n");

System.out.print("Elementary test test two: ");
String[] t2 = {"Chrysanthemum Guggenheim", "To seek the Holy Grail.", "Blue"};
e3.setTestInput(t2);
e3.takeTest();
System.out.print((e3.getTestResults().equals("2/3")) ? "Test Passed\n" : "Test Failed\n");



System.out.print("Middle school test test: ");
String[] t3 = {"3",Integer.toString(m6.getFeetThick()),"Ted Cruz"};
m6.setTestInput(t3);
m6.takeTest();
System.out.print((m6.getTestResults().equals("3/3")) ? "Test Passed\n" : "Test Failed\n");


System.out.print("Highschool test test: ");
String[] t4 = {"Rodrick Heffley", "To seek the Holy Grail.", "What do you mean? An African or European swallow?"};
h7.setTestInput(t4);
h7.takeTest();
System.out.print((h7.getTestResults().equals("3/3")) ? "Test Passed\n" : "Test Failed\n");


    }
}
