package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final Integer number;
    private Student leader;
    private List<Student> studentList;
    private List<Teacher> observers;

    public Klass(int number) {
        this.number = number;
        this.observers = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (!isIn(student)) {
            System.out.println("It is not one of us.");
            return;
        }

        this.leader = student;
        this.notifyTeacherForNewLeader(student);
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.getNumber());
    }

    public void appendMember(Student student) {
        studentList.add(student);
        this.notifyTeacherForNewStudent(student);
    }

    public boolean isIn(Student student) {
        return this.studentList.stream().anyMatch(classMate -> classMate.equals(student));
    }

    public void register(Teacher teacher) {
        this.observers.add(teacher);
    }

    public void notifyTeacherForNewStudent(Student student) {
        for (Teacher follower : observers) {
            follower.updateNewStudentJoinedClass(student.getName(), this.getNumber());
        }
    }

    private void notifyTeacherForNewLeader(Student student) {
        for (Teacher follower : observers) {
            follower.updateNewLeaderForClass(student.getName(), this.getNumber());
        }
    }
}
