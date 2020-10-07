package Pr_6;

public class SortByGPA extends Student implements Comparable<Student> {

    public SortByGPA(String name, int iD, int points) {
        super(name, iD, points);
    }

    @Override
    public int compareTo(Student o) {
        return this.points.compareTo(o.points);
    }
}