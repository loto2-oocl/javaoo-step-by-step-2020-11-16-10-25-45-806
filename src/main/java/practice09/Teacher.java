package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new ArrayList<Klass>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
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
}