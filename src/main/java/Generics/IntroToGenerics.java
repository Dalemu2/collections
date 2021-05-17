package Generics;

public class IntroToGenerics {

    // all collection classes are generic classes
    // what is java generics
    // - allows to create own object
    // - template
    // - allows any object type
    // - run time
    public static void main(String[] args) {
        Product<String> product= new Product<>();
        product.productID = "product101";
       // System.out.println(product.productID);
        Product<Boolean> product1= new Product<>();
        product1.productID = true;
      //  System.out.println(product1.productID);
        Product<Integer> product2 = new Product<>();
        product2.productID = 111;
       // System.out.println(product2.productID);
    //    System.out.println(product.getProductID() + "\n" + product1.getProductID() + "\n" + product2.getProductID());


        TestDemo<Integer,String> test = new TestDemo<>(12,"abc");
        System.out.println(test);
        System.out.println(test.getTestOne() + "  " + test.getTestTwo());
        test.setTestOne(15);
        test.setTestTwo("XYZ");
        System.out.println(test.getTestOne() + "  " + test.getTestTwo());
    }
}

class Product<Q>{
    Q productID;
    Q productName;

    public Q getProductID(){
        return this.productID;
    }
}

class TestDemo<T,Q>{

      T testOne;
      Q testTwo;

    public TestDemo(T testOne, Q testTwo) {
        this.testOne = testOne;
        this.testTwo = testTwo;
    }

    public T getTestOne() {
        return testOne;
    }

    public void setTestOne(T testOne) {
        this.testOne = testOne;
    }

    public Q getTestTwo() {
        return testTwo;
    }

    public void setTestTwo(Q testTwo) {
        this.testTwo = testTwo;
    }
}