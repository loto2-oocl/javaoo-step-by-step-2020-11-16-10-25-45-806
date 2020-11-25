package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.getKlass() == null) {
            return String.format("%s I am a %s. I teach No Class.", super.introduce(), this.getClass().getSimpleName());
        }
        return String.format("%s I am a %s. I teach %s.", super.introduce(), this.getClass().getSimpleName(), this.getKlass().getDisplayName());
    }

    public String introduceWith(Student student) {
        boolean sameClass = this.getKlass().getNumber().equals(student.getKlass().getNumber());
        if (sameClass) {
            return String.format("%s I am a %s. I teach %s.", super.introduce(), this.getClass().getSimpleName(), student.getName());
        }
        return String.format("%s I am a %s. I don't teach %s.", super.introduce(), this.getClass().getSimpleName(), student.getName());
    }
}
