package practice06;

public class Klass {
    private final Integer number;

    public Klass(int number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.getNumber());
    }

}
