import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Map<String, Integer> pillows = new HashMap<>();

        Student student1 = new Student("Иванов", 8, 0);
        Student student2 = new Student("Петров", 10, 9);
        Student student3 = new Student("Сидоров", 12, 0);
        Student student4 = new Student("Чапаев", 10, 5);
        Student student5 = new Student("Баранов", 20, 10);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Iterator<Student> iterator = students.iterator();

        System.out.println("        Список всех учащихся: ");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        while (iterator.hasNext()) { // удаляет из списка здоровых людей
            if (iterator.next().diseaseLevel() == 0) {
                iterator.remove();
            }
        }

        System.out.println("          Список больных:");
        Collections.sort(students); // сортируем по уровню заболевания(от меньшего к большему)
        for (Student str : students) {
            System.out.println(str);
        }

        pillows.put("Уголь", 100000);
        pillows.put("Аспирин", 10);
        pillows.put("Зеленка", 100);

        System.out.println();
        ComparAge comparAge = new ComparAge();
        students.sort(comparAge);

        Collections.reverse(students); // разварачиваем список для того чтобы медсестра вызывала сначало людей с
                                       // сильными заболеваниями.
                                       // Я не поняла почему у меня не получилось этого сделать в методе goToCheckup()
        Nurse nurse = new Nurse(students, pillows);
        nurse.goToCheckup(nurse.getStudents());
    }

}
