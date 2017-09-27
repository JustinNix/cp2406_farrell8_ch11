public abstract class Student {
    int studentNum;
    String lastName;
    double annualTuition;

    public Student(int studentNum, String lastName){
        this.studentNum = studentNum;
        this.lastName = lastName;
    }

    public double getAnnualTuition() {
        return annualTuition;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void setAnnualTuition();

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

}
