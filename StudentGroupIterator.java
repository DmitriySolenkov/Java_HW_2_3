import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    int index = -1;

    @Override
    public boolean hasNext() {
        return (index < studentGroup.getSizeofGroup() - 1);

    }

    @Override
    public Student next() {
        index++;
        return studentGroup.getStudent(index);
    }

}
