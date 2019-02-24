public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private float grade;
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setStudentID(String ID){}
    public Student(String firstName, String lastName, String studentID){
        this.firstName = firstName;
        this.studentID = studentID;
        this.lastName = lastName;
    }
    public void setGrade(float grade){
        this.grade = grade;
    }
    public float getGrade(){
        return this.grade;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getStudentID()
    {
        return this.studentID;
    }
    public String getInfo(){
        String s = "Name: " + this.firstName + " " + this.lastName + "\n" + "Student ID: " + this.studentID + "\n" + "Grade: " + Integer.toString((int)this.grade);
        return s;
    }
    public char getGradeScale()
    {
        return (this.grade > 15) ? 'A' : ((this.grade > 10) ? 'B' : 'F');
    }

}



