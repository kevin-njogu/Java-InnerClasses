abstract public class AnonymousClass {
    abstract void methodOne();
}

interface Ianonymous {
    void methodTwo();
}

class DefineAnonymous {
    int y = 12;

    public void methodTwo() {
        int z = 10;
        AnonymousClass an = new AnonymousClass() {
            @Override
            void methodOne() {
                System.out.println(z);
                System.out.println(y);
                System.out.println("This is defining an anonymous class during object creation");
            }
        };
        an.methodOne();

        Ianonymous in = new Ianonymous() {
            @Override
            public void methodTwo() {
                System.out.println("Anonymous class implementing an interface and overriding the abstract methods");
            }
        };
        in.methodTwo();
    }
}
