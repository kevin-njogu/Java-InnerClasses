/*
*Inner classes basically mean classes defined inside other classes also called nested class
* They are mainly used to reduce the complexity of a bigger class or simplify a bigger class
* An interface can also be defined inside an outer class
* There are four types of inner classes: nested, static, anonymous, local
* Nested inner class:
*   1. can access the members/properties/variables of an outer class directly
*   2. You can utilize these classes by creating their object instances inside the outer class
*   3. Outer classes cannot directly access the members of inner classes. They can only access them through object instances of inner class
*   4. Outside the outer class, inner class is not directly accessible. It is oly accessible by first creating an object of
*       outer class e.g. Outer o = new Outer() =>  Outer.Inner i = new Outer().newInner()
*   5. After compilation of classes with nested inner classes, two files are generated:
*       a. Outer.class
*       b. Outer$Inner.class
*   6. An object of inner class can be defined before the class is defined directly inside the outer class
* Local inner class:
*   1. Class defined inside a method of an outer class
*   2. This class is only visible and useful inside the method in which it is defined
*   3. Useful for writing a class that is inheriting from another class or implementing interfaces
*   4. only abstract keyword can be used
* Anonymous Inner class:
*   1. They are classes defined inside a method of outer class,
*   2. Mainly useful for abstract classes and interfaces
*   3. They are defined during object creation and method overriding is done
* Static inner class:
*   1. They are static classes defined inside another class
*   2. Objects of static inner classes can be created from anywhere outside the outer classes without having to create objects of outer classes
*   3. They can directly access only the static properties/members/variables of outer class
 */

public class Main {
    public static void main(String[] args) {

        //Creating objects of inner nested classes outside their outer classes
        NestedInnerClass ns = new NestedInnerClass();
        ns.outerDisplay();
        //object of inner class
        NestedInnerClass.InnerClass inner = new NestedInnerClass().new InnerClass();
        inner.innerDisplay();

        //local inner method
        LocalClass lc = new LocalClass();
        lc.methodOne();

        //Anonymous class
        DefineAnonymous df = new DefineAnonymous();
        df.methodTwo();

        //Static inner class
        StaticInnerClass.Inner inn = new StaticInnerClass.Inner();
        inn.display();
    }
}
