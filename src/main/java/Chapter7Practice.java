class A {
    A(int i) {
        System.out.println("A()");
    }
    void a() {
        System.out.println("a() from class A.");
    }
}

class B {
    B() {
        System.out.println("B()");
    }
}

class C extends A {
    B b = new B();
    C() {
        super(1);
        System.out.println("C()");
    }
    C(int i) {
        super(i);
        System.out.println("C()");
    }

    public void a(int i) {
        System.out.println("Override from class A.");
    }

    public static void main(String[] args) {
        C c = new C(2);
    }
}

class D extends C {
    D(int i) {
        super(i);
        System.out.println("D()");
    }
    public static D makeD() {
        return new D(6);
    }
    public static void main(String[] args) {
        D d1 = new D(1);
        D d2 = makeD();
    }
}

class E extends D {
    E(int i) {
        super(i);
        System.out.println("E()");
    }
    public static void main(String[] args) {
        E e = new E(2);
        D.main(args);
    }
}

class Insect {
    private int i = 9;
    private int z = printInit("Insect.z initialized");
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {

    }
}

class Scarab extends Beetle {
    private int n = printInit("Scarab.n initialized");
    public Scarab() {
        System.out.println("n = " + n);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("static Scarab.x3 initialized");
    public static void main(String[] args) {
        System.out.println("Scarab constructor");
        // Scarab sc = new Scarab();
    }
}

/*
章节7：复用类
 */
public class Chapter7Practice {
    /*
    练习十三：方法重载
     */
    static void override() {
        C c = new C();
        c.a();
        c.a(1);
    }

    public static void main(String[] args) {
        override();
    }
}
