
Abstract Student class
    Variables:
    - int studentId 
    - String studentName
    Methods
    - Student(studentName, studentId)
    - getStudentId()
    - getStudentName()
    - toString()
    - progressReport()

Interface TestTaker
    - int studentId
    - takeTest() //no parameters, no return value
    - getTestResults() //return String


class HighSchooler extends Student impliments TestTaker
    Variables
    - All inherited instance variables
    - Boolean smelly
    Methods
    - All inherited methods
    - getSmell() 
    - setSmell(newSmell)


class MiddleSchooler extends Student impliments TestTaker
    Variables
    - All inherited instance variables
    - long width
    Methods
    - All inherited methods
    - getWidth()
    - setWidth(newWidth)


class ElementrySchooler extends Student impliments TestTaker
    Variables
    - All inherited variables
    - ArrayList<String> collegeDegree
    Methods
    - All inherited methods
    - setCollegeDegree(newCollegeDegree)
    - getCollegeDegree()


class GeneralStudent extends Student
    Variables:
    - int studentId 
    - String studentName
    - String homeRoomTeacher
    - ArrayList<activities>
    Methods
    - All Inherited methods
    - getStudentActivities()
    - getHomeRoomTeacher()
    - setStudentActivities(activity)
    - setHomeRoomTeacher(newHomeRoomTeacher)


class Kindergartner extends GeneralStudent{
    Variables
    - All inherited variables

    Methods
    - All inherited methods
    - showAndTell()
    - toString() //override

}