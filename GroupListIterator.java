import java.util.Iterator;

public class GroupListIterator implements Iterator<Student> {
    StudentGroup studentGroup;

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int index = -1;

    @Override
    public boolean hasNext() {
        return (index < studentGroup.getSizeofGroup() - 1);

    }

    @Override
    public Student next() {
        index++;
        return studentGroup.getStudent(index);
    }

    public boolean hasPrevious() {
        return (index > 0);

    }

    public Student previous() {
        index--;
        return studentGroup.getStudent(index);
    }

}
