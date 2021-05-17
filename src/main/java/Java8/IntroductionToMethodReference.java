package Java8;

public class IntroductionToMethodReference {
    /*
        Object::instance method
        Class::static method
        class::instance method
        class::new

    */
    public static void main(String[] args) {

       /* MethodRef methodRef = () -> {
            System.out.println("display method...");
        };
        methodRef.display();
        */
        IntroductionToMethodReference reference = new IntroductionToMethodReference();
        MethodRef ref = reference::myDisplayMethod;
        ref.display();

    }
    void myDisplayMethod(){
        System.out.println("my display method");
    }
}

@FunctionalInterface
interface MethodRef{
    void display();
}