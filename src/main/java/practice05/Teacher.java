package practice05;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public String getKlassString() {
        if (this.getKlass() == null) {
            return "No Class";
        }
        return String.format("Class %d", this.getKlass());
    }

    @Override
    public String introduce() {
        return String.format("%s I am a %s. I teach %s.", super.introduce(), this.getClass().getSimpleName(), this.getKlassString());
    }
}
