public class Programmer extends Person {
    public Programmer(String name, int age, String designation) {
        super(name, age, designation);
    }

    @Override
    void eat() {
        System.out.println(getName() + " eating");
    }

    @Override
    void walk() {
        System.out.println(getName() + " walking");
    }

    void learn() {
        System.out.println(getName() + " learning");
    }

    void companyName() {
        System.out.println(getName() + "---> company name: name");
    }


    void coding() {
        System.out.println(getName() + " coding");
    }


    @Override
    public String toString() {
        return "Programmer" + "\n" +
                "name:'" + getName() + "\n" +
                "age:" + getAge() + "\n" +
                "designation:'" + getDesignation();


    }
}

