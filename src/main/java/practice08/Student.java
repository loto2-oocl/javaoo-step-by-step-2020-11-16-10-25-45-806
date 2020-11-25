package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        StringBuilder introduction = new StringBuilder(super.introduce())
            .append(String.format(" I am a %s.", this.getClass().getSimpleName()));

        if (this.getKlass().getLeader() != null && this.getKlass().getLeader().getId() == this.getId()) {
            introduction.append(String.format(" I am Leader of %s.", this.getKlass().getDisplayName()));
        } else {
            introduction.append(String.format(" I am at %s.", this.getKlass().getDisplayName()));
        }

        return introduction.toString();
    }
}
