public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Lolo", 15, "programmer");
        Dancer dancer = new Dancer("Kaka", 16, "dancer");
        Singer singer = new Singer("Gaga", 14, "singer");


        System.out.println("------------------------------");
        System.out.println(programmer);
        programmer.eat();
        programmer.coding();
        programmer.walk();
        programmer.learn();
        programmer.companyName();

        System.out.println("------------------------------");
        System.out.println(dancer);
        dancer.eat();
        dancer.dansing();
        dancer.groupName();
        dancer.walk();
        dancer.learn();

        System.out.println("------------------------------");
        System.out.println(singer);
        singer.eat();
        singer.bandName();
        singer.singing();
        singer.walk();
        singer.learn();
    }
}