package java111.project4;
/** @author Trevor Zellmer */
//Ideally test would be completely separated from each subclass of student
//because there is a many to many relationship between students and tests.
//However the directions specify unqiue takeTest methods for each subclass
//and a parameterless takeTest() method, so I kind worked around it.
//As a result I have a stubby little Test class.


class Test {
    String[] testQuestions, testAnswers;
    public Test(String[] testQuestions, String[] testAnswers){
    this.testQuestions = testQuestions;
    this.testAnswers = testAnswers;
    }
    /** @param studentInput
     * @returns String
     */
    public String gradeTest(String[] studentInput){
        int score = 0;
        for (int i = 0; i < testQuestions.length; i++) 
            if (testAnswers[i].equals(studentInput[i])) 
                score++;
        return score + "/" + testQuestions.length;
    }
}