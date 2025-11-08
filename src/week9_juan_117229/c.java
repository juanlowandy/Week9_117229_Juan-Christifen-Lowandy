package week9_juan_117229;

interface a {
    void displayA();
}

interface b {
    void displayB();
}

public class c implements a, b {
    public void displayA() {
        System.out.println("Display A");
    }

    public void displayB() {
        System.out.println("Display B");
    }

    public static void main(String[] args) {
        c c = new c();
        c.displayA();
        c.displayB();
    }
}
