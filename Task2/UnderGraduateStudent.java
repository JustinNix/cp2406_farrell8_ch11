public class UnderGraduateStudent extends Student {

    public UnderGraduateStudent(int studentNum, String lastName) {
        super(studentNum, lastName);
    }

    @Override
    public void setAnnualTuition() {
        annualTuition = 40000;
    }
}
