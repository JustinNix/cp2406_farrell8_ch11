public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[6];

        UnderGraduateStudent student = new UnderGraduateStudent(13123, "lucy");
        student.setAnnualTuition();
        UnderGraduateStudent student2 = new UnderGraduateStudent(23423, "greg");
        student2.setAnnualTuition();
        GraduateStudent student3 = new GraduateStudent(1231231243, "adfasd");
        student3.setAnnualTuition();
        GraduateStudent student4 = new GraduateStudent(123123123, "Allison");
        student4.setAnnualTuition();
        StudentAtLarge student5 = new StudentAtLarge(1232, "Lord Farquard");
        student5.setAnnualTuition();
        StudentAtLarge student6 = new StudentAtLarge(78978, "me");
        student6.setAnnualTuition();
        students[0] = student;
        students[1] =student2;
        students[2] =student3;
        students[3] =student4;
        students[4] =student5;
        students[5] =student6;

        for(int i = 0 ; i<students.length; i++){
            System.out.println(students[i].lastName + " " + students[i].annualTuition);
        }

    }
}
