public class Student {
    protected String name;
    protected String birthDate;
    protected Float averageGrade;

    public Student(String name, String birthDate, Float averageGrade) {
        this.name = name;
        this.birthDate = birthDate;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Float averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", birthDate=" + birthDate + ", averageGrade=" + averageGrade + "]";
    }

}