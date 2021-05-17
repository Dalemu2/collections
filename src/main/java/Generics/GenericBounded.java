package Generics;

public class GenericBounded {
    public static void main(String[] args) {
        Price<Integer> price = new Price<>();
        price.setPrice(12);
        int currentPrice = price.getPrice();
        System.out.println(currentPrice);
        price.checkThePriceDataType(currentPrice);

        EvenOrOdd<Integer> number = new EvenOrOdd<>();
        number.setNumber(12);
        number.checkEvenOrOdd(19);

    }
}

class Price<T>{
    private T price;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public <V extends Number> void checkThePriceDataType(V v){
        System.out.println("The value of price  :" + price.getClass().getName());
        System.out.println("The value of v : " + v.getClass().getName());
    }
}

class EvenOrOdd<T>{
    T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public <T extends Integer> void checkEvenOrOdd(T num){
        if (num.intValue() %  2 == 0){
            System.out.println("Number is even" );
        }else {
            System.out.println("number is odd");
        }
    }
}