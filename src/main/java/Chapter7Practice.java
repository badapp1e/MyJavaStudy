class A {
    A(int i) {
        System.out.println("A()");
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
    }
    C(int i) {
        super(i);
        System.out.println("C()");
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

/*
章节7：复用类
 */
public class Chapter7Practice {

}
