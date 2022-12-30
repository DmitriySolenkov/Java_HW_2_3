import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {

    StudentGroup studentGroup;

    public ReverseIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;

    }

    public int index;

    @Override
    public boolean hasNext() {
        return (index > 0);
    }

    @Override
    public Student next() {
        index--;
        return studentGroup.getStudent(index);
    }

}
