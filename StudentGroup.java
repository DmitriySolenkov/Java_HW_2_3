import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    List<Student> studentGroup;

    public StudentGroup(List<Student> students) {
        this.studentGroup = students;
    }

    public List<Student> getStudentGroup() {
        return studentGroup;
    }

    public int getSizeofGroup() {
        return this.studentGroup.size();
    }

    public Student getStudent(int index) {
        return studentGroup.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public Iterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

    public ReverseIterator revIterator() {
        return new ReverseIterator(this);
    }

}
