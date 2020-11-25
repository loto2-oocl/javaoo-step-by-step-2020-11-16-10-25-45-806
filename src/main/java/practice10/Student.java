package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        this.klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        StringBuilder introduction = new StringBuilder(super.introduce())
                .append(String.format(" I am a %s.", this.getClass().getSimpleName()));

        Student leader = this.getKlass().getLeader();
        if (leader != null && leader.getId().equals(this.getId())) {
            return introduction.append(String.format(" I am Leader of %s.", this.getKlass().getDisplayName())).toString();
        }

        return introduction.append(String.format(" I am at %s.", this.getKlass().getDisplayName())).toString();
    }
}
