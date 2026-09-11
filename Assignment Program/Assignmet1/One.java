package assignment;

class Onee {
    int x = 27;

    void show() {
        System.out.println("This is one");
    }
}

class Two extends Onee {
    int y = 34;

    void see() {
        System.out.println("see: " + super.x + " " + this.y);
    }
}


class Three extends Onee {
    int z = 12;

    void demo() {
        System.out.println("see: " + super.x + " " + this.z);
    }
}

public class One {
    public static void main(String[] args) {

        Two w = new Two();
        Three r = new Three();

        w.see();
        r.demo();
    }
}