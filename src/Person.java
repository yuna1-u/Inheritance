public class Person {
    private String name;
    private int age;
    private String designation;

    void learn() {
    }

    void eat() {
    }

    void walk() {
    }

    public Person(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}

