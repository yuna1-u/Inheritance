public class Dancer extends Person {
    public Dancer(String name, int age, String designation) {
        super(name, age, designation);
    }

    @Override
    void eat() {
        System.out.println(getName() + " eating");
    }

    @Override
    void walk() {
        System.out.println(getName() + " going");
    }

    void learn() {
        System.out.println(getName() + " lerning");
    }


    void groupName() {
        System.out.println(getName() + "---> group name: name");
    }

    void dansing() {
        System.out.println(getName() + " dansing");
    }


    @Override
    public String toString() {
        return "Dancer" + "\n" +
                "name:'" + getName() + "\n" +
                "age:" + getAge() + "\n" +
                "designation:'" + getDesignation();
    }
}
