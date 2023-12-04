package java111.project4;
import java.util.ArrayList;
import java.util.Scanner;
/** @author Trevor Zellmer */
public class SchoolLauncher {
    public static void main(String[] args){
        Menu m = new Menu();
        m.menu();
    }

}
class Menu{

    Scanner scnr = new Scanner(System.in);
    ArrayList<Student> school = new ArrayList<Student>();
    public void menu(){
        System.out.println(
        "\n======================== MENU ==============================\n" +
        "c - Create new student\n" +
        "t - Test student\n" +
        "s - School summary\n" +
        "q - Quit\n\n" +
        "Choose an option:"
        );
        System.out.println();
        String input = scnr.nextLine();
        switch (input) {
            case "c": createMenu();
                break;
            case "t": testStudent();
                break;
            case "s": schoolSummary();
                break;
            case "q": System.exit(0);
                break;
            default:
                System.out.println("-------------------- INVALID INPUT -------------------------");
                menu();
                break;
        }
    }

    public void createMenu(){
        System.out.println(
        "\n======================== CREATE MENU =======================\n" +
        "1 - Create new highschooler\n" +
        "2 - Create new middleschooler\n" +
        "3 - Create new elementryschooler\n" +
        "4 - Create new kindergartner\n" +
        "e - Exit to main menu\n" +
        "q - Quit\n\n" +
        "Choose an option:"
        );
        String input = scnr.nextLine();
        switch (input) {
            case "1": createHighSchooler();
                break;
            case "2": createMiddleSchooler();
                break;
            case "3": createElementarySchooler();
                break;
            case "4": createKindergartner();
                break;
            case "e": menu();
                break;
            case "q": System.exit(0);
                break;
            default:
                System.out.println("-------------------- INVALID INPUT -------------------------");
                createMenu();
                break;
        }
 
    }

    public Student createHighSchooler(){
    try{
        System.out.println("Enter student id");
        int studentId = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter student name");
        String studentName = scnr.nextLine();
        System.out.println("What does this student smell like?");
        String smell = scnr.nextLine();
        HighSchooler hs = new HighSchooler(studentId, studentName);
        school.add(hs);
        hs.setSmell(smell);
        createMenu();
        return hs;
    } catch(Exception e){
        System.out.println("-------------------- INVALID INPUT -------------------------");
        createMenu();
        return null;
    }
}

public Student createMiddleSchooler(){
    try{
        System.out.println("Enter student id");
        int studentId = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter student name");
        String studentName = scnr.nextLine();
        System.out.println("What is their approximate depth (thickness)?");
        int feetThick = scnr.nextInt();
        scnr.nextLine();
        MiddleSchooler ms = new MiddleSchooler(studentId, studentName);
        school.add(ms);
        ms.setFeetThick(feetThick);
        createMenu();
        return ms;
    } catch(Exception e){
        System.out.println("-------------------- INVALID INPUT -------------------------");
        createMenu();
        return null;
    }
}

public Student createElementarySchooler(){
    try{
        System.out.println("Enter student id");
        int studentId = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter student name");
        String studentName = scnr.nextLine();
        ElementarySchooler es = new ElementarySchooler(studentId, studentName);
        school.add(es);
        System.out.println("Enter college degrees:");
        es.setDegrees(listHandler());
        createMenu();
        return es;
    } catch(Exception e){
        System.out.println("-------------------- INVALID INPUT -------------------------");
        createMenu();
        return null;
    }
}

public Student createKindergartner(){
    try{
        System.out.println("Enter student id");
        int studentId = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter student name");
        String studentName = scnr.nextLine();
        Kindergartner kg = new Kindergartner(studentId, studentName);
        school.add(kg);
        System.out.println("Enter Homeroom teacher:");
        kg.setHomeRoomTeacher(scnr.nextLine());
        System.out.println("Enter a show & tell item:");
        kg.setShowAndTell(scnr.nextLine());
        System.out.println("Enter extracurricular activities:");
        kg.setActivities(listHandler());
        createMenu();
        return kg;
    } catch(Exception e){
        System.out.println("-------------------- INVALID INPUT -------------------------");
        createMenu();
        return null;
    }
}

/** @param testQuestions
 * @return testInput
 */
    public String[] testHandler(String[] testQuestions){
        try{
        int count = 0;
        String[] testInput = {"null","null","null"};
        testInput[count] = scnr.nextLine();
        for (String q: testQuestions){
            System.out.println(q);
            testInput[count] = scnr.nextLine();
            count++;
        }
        return testInput;
        } catch(Exception e){
        //System.out.println(e);
        System.out.println("-------------------- INVALID INPUT -------------------------");
        return null;
        }
    }

    public void testStudent(){
        try{
        System.out.println("Enter a student id:");
        int studentId = scnr.nextInt();
        scnr.nextLine();
        System.out.println("----------------------- BEGIN TEST -------------------------");

        switch (studentById(studentId).getClass().getSimpleName()) {
            case "HighSchooler":
            HighSchooler hs = ((HighSchooler) studentById(studentId));
            hs.setTestInput(testHandler(hs.getTestQuestions()));
            hs.takeTest();
            System.out.println("-------------------- YOUR SCORE IS: "+ hs.getTestResults() + "---------------------");
            menu();
                break;
            case "MiddleSchooler":
            MiddleSchooler ms = ((MiddleSchooler) studentById(studentId));
            ms.setTestInput(testHandler(ms.getTestQuestions()));
            ms.takeTest();
            System.out.println("-------------------- YOUR SCORE IS: "+ ms.getTestResults() + "---------------------");
            menu();
                break;
            case "ElementarySchooler":
            ElementarySchooler es = ((ElementarySchooler) studentById(studentId));
            es.setTestInput(testHandler(es.getTestQuestions()));
            es.takeTest();
            System.out.println("-------------------- YOUR SCORE IS: "+ es.getTestResults() + "---------------------");
            menu();
                break;
            case "Kindergartner":
            System.out.println("------------- Kindergartners can't take tests --------------");
            menu();
                break;
            default:
            System.out.println("-------------------- INVALID INPUT -------------------------");
            menu();
                break;
        }

        } catch(Exception e){
        System.out.println("-------------------- INVALID INPUT -------------------------");

        }
    }

    public void schoolSummary(){
        System.out.println("============ DISPLAYING All PROGRESS REPORTS ===============");
        school.forEach((i) -> {System.out.println(i.progressReport() + "\n");});
        menu();
    }

    /** @param ArrayList */
    public ArrayList<String> listHandler(){
    ArrayList<String> arr = new ArrayList<String>();
    try{
    String input = scnr.nextLine();
    while(!input.equals("e")){
        arr.add(input);
        System.out.println("Enter another value, or 'e' to exit:");
        input = scnr.nextLine();
        }
    } catch(Exception e) {
        System.out.println("-------------------- INVALID INPUT -------------------------");
    }
        return arr;
    }
    /** @param studentId */
    public Student studentById(int studentId){
        for (Student s: school) {
            if(s.studentId == studentId)
                return s;
        }
        return null;
    }
}
