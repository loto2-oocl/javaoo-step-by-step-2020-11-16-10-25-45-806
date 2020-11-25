package practice08;

public class Klass {
    private final Integer number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if (leader.getKlass().getNumber().equals(this.getNumber())) {
            this.leader = leader;
        }
        System.out.println("It is not one of us.");
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.getNumber());
    }

    public void appendMember(Student student) {

    }
}