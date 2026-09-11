package assignment;

class Classs {
    int x = 27;

    void show() {
        System.out.println("This is one");
    }
}

// Single inheritance
class Classss1 extends Classs {
    int y = 34;

    void see() {
        System.out.println("see: " + super.x + " " + this.y);
    }
}

// Multilevel inheritance
class Classss2 extends Classss1 {
    int z = 12;

    void demo() {
        System.out.println("see: " + super.x + " " + super.y + " " + this.z);
    }
}

// Hierarchical inheritance
class Classss3 extends Classss2 {
    int a = 10;

    void display() {
        System.out.println("display: " + super.x + " " + super.y + " " + super.z + " " + this.a);
    }
}

// Another branch
class Classss4 extends Classss1 {
    int b = 20;

    void demos() {
        System.out.println("demos: " + super.x + " " + super.y + " " + this.b);
    }
}

public class Classss {
    public static void main(String[] args) {

        Classss3 c = new Classss3();
        c.demo();
        c.display();

        Classss4 s = new Classss4();
        s.demos();
    }
}
