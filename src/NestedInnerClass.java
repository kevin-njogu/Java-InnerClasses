public class NestedInnerClass {
    int x = 10;

    //This class is now available for use throughout the class
    InnerClass i = new InnerClass();

    class InnerClass {
        int y = 20;

        //directly accessing members outer class
        public void innerDisplay() {
            System.out.println("The outer class member x value is " + x);
            System.out.println("This is the inner class display");
        }
    }

    //indirectly accessing members and methods of inner class
    public void outerDisplay() {
        InnerClass ic = new InnerClass();
        System.out.println("This is the outer class display");
        System.out.println("The inner class member y value is " + ic.y);
        ic.innerDisplay();
    }

}
