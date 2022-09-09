import java.util.ArrayList;

import java.util.Map;

public class Nurse implements Speaker {
    private ArrayList<Student> students; // список студентов
    private Map<String, Integer> pillows;

    public Nurse(ArrayList<Student> students, Map<String, Integer> pillows) {
        this.students = students;
        this.pillows = pillows;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Map<String, Integer> getPillows() {
        return pillows;
    }

    @Override
    public void goToCheckup(ArrayList<Student> students) {
        for (Student student : students) {
            if (student.diseaseLevel() != 0) {
                System.out.println(student.getName() + ", беги на медосмотр");
            }
        }
    }
}
