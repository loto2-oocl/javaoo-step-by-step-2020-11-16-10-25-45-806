package practice03;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return String.format("I am a %s. I have a job.", this.getClass().getSimpleName());
    }
}
