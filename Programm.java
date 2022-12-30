import java.util.Arrays;
import java.util.Iterator;

public class Programm {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
                new Student("Иван Иванов", "24.06.1997", 4.6f),
                new Student("Петр Петров", "13.11.1998", 4.3f),
                new Student("Алина Алинова", "12.12.1912", 2.0f),
                new Student("Юлия Юльева", "07.01.1999", 4.9f)));

        // Односторонний итератор идет вниз
        Iterator<Student> studentIt = studentGroup.iterator();
        while (studentIt.hasNext()) {
            System.out.println(studentIt.next());
        }
        System.out.println("-------------------");
        // Двусторонний итератор идет вниз
        GroupListIterator bothSidesIT = (GroupListIterator) studentGroup.listIterator();
        while (bothSidesIT.hasNext()) {
            System.out.println(bothSidesIT.next());
        }
        System.out.println("-------------------");
        // Двусторонний итератор идет вверх
        bothSidesIT.index++;
        while (bothSidesIT.hasPrevious()) {
            System.out.println(bothSidesIT.previous());
        }
        System.out.println("-------------------");

        // Итератор идет в обратном направлении
        ReverseIterator reverseIt = studentGroup.revIterator();

        reverseIt.index = studentGroup.getSizeofGroup();
        while (reverseIt.hasNext()) {
            System.out.println(reverseIt.next());
        }

    }
}
