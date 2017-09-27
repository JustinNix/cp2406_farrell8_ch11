public class StudentAtLarge extends Student {

    public StudentAtLarge(int studentNum, String lastName) {
        super(studentNum, lastName);
    }

    @Override
    public void setAnnualTuition() {
        annualTuition = 2000;
    }
}
