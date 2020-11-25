package practice07;

public class Person {
    private Integer id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Person compare = (Person)obj;
        return compare.getId().equals(this.getId());
    }
}
