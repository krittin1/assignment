package exam;

public class Cappuccino implements CoffeeMaker{


    private String name;


    public Cappuccino() {
        this.name = "Cappuccino";
    }


    public String getName() {
        return name;
    }

    @Override
    public String prepareRecipe() {
        return "Coffee -“Espresso 1/3 cup”\n" +
                "Mix-“Milk 1/3 cup” , “Milk Foam 1/3 cup”";
    }
}
