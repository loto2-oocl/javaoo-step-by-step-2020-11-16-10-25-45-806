package practice04;

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return String.format("%s I am a %s. I have a job.", super.introduce(), this.getClass().getSimpleName());
    }
}
