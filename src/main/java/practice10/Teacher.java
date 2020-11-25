package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private final List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new ArrayList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;

        registerForClass(classes);
    }

    private void registerForClass(List<Klass> classes) {
        for (Klass klass : classes) {
            klass.register(this);
        }
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (this.getClasses().isEmpty()) {
            return String.format("%s I am a %s. I teach No Class.", super.introduce(), this.getClass().getSimpleName());
        }

        return String.format("%s I am a %s. I teach Class %s.",
                super.introduce(),
                this.getClass().getSimpleName(),
                this.getTeachingClassDisplayString());
    }

    public String getTeachingClassDisplayString() {
        return this.getClasses().stream()
                .map(Klass::getNumber)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public String introduceWith(Student student) {
        if (this.isTeaching(student)) {
            return String.format("%s I am a %s. I teach %s.", super.introduce(), this.getClass().getSimpleName(), student.getName());
        }
        return String.format("%s I am a %s. I don't teach %s.", super.introduce(), this.getClass().getSimpleName(), student.getName());
    }

    public boolean isTeaching(Student student) {
        return this.getClasses().stream().anyMatch(klass -> klass.isIn(student));
    }

    public void updateNewStudentJoinedClass(String studentName, Integer classNumber) {
        System.out.printf("I am %s. I know %s has joined Class %d.%n", this.getName(), studentName, classNumber);
    }

    public void updateNewLeaderForClass(String studentName, Integer classNumber) {
        System.out.printf("I am %s. I know %s become Leader of Class %d.%n", this.getName(), studentName, classNumber);
    }
}