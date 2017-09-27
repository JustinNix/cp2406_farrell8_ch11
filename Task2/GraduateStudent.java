public class GraduateStudent extends Student {

    public GraduateStudent(int studentNum, String lastName) {
        super(studentNum, lastName);
    }

    @Override
    public void setAnnualTuition() {
        annualTuition = 6000;
    }
}
