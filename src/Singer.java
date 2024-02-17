public class Singer extends Person {
    public Singer(String name, int age, String designation) {
        super(name, age, designation);
    }

    @Override
    void walk() {
        System.out.println(getName() + " walking");
    }

    @Override
    void eat() {
        System.out.println(getName() + " eating");
    }

    void learn() {
        System.out.println(getName() + " learning");
    }

    void bandName() {
        System.out.println(getName() + "---> band name: name");

    }

    void singing() {
        System.out.println(getName() + " singing");
    }


    @Override
    public String toString() {
        return "Singer" + "\n" +
                "name:'" + getName() + "\n" +
                "age:" + getAge() + "\n" +
                "designation:'" + getDesignation();
    }
}

