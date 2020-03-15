package exam;

public class CoffeeShop {

    private CoffeeMaker coffeeMaker;

    public void setRescipee(CoffeeMaker maker){
        this.coffeeMaker = maker;
    }

    public  String orderBeverage(String type){


        return type + "\n" + coffeeMaker.prepareRecipe() + "\n" + "boiling water\n"
                + "brewing coffee\n" + "pouring into cup";

    }
}
