package exam;

public class Customer {


    public static void main(String[] args) {


        CoffeeShop coffeeShop = new CoffeeShop();

        coffeeShop.setRescipee(new Latte());
        System.out.println(coffeeShop.orderBeverage(new Latte().getName()));
        System.out.println();

        coffeeShop.setRescipee(new Cappuccino());
        System.out.println(coffeeShop.orderBeverage(new Cappuccino().getName()));
        System.out.println();

        coffeeShop.setRescipee(new Mocha());
        System.out.println(coffeeShop.orderBeverage(new Mocha().getName()));
    }
}
