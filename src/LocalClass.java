public class LocalClass {

    public void methodOne() {
        class Inner {
            public void innerClassMethod() {
                System.out.println("This is the method of local inner class");
            }
        }

        Inner in = new Inner();
        in.innerClassMethod();
    }
}
