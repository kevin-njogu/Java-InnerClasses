public class StaticInnerClass {
    static int y = 15;
    int x = 20;

    static class Inner {
        public void display() {
            System.out.println("The static property is " + y);
            //System.out.println(x); //cannot access non-static members
        }
    }
}
