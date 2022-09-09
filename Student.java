
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int diseaseLevel;

    public Student(String name, int age, int diseaseLevel) {
        this.name = name;
        this.age = age;
        this.diseaseLevel = diseaseLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int diseaseLevel() {
        return diseaseLevel;
    }

    public void setdiseaseLevel(int diseaseLevel) {
        this.diseaseLevel = diseaseLevel;
    }

    @Override
    public int compareTo(Student comparestu) {
        int compareage = ((Student) comparestu).diseaseLevel();
        return this.diseaseLevel() - compareage;

    }

    @Override
    public String toString() {
        return " Фамилия " + name + ", возраст "
                + age + ", Степень заболевания - " + diseaseLevel + "";
    }
}
