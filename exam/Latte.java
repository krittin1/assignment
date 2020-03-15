package exam;

public class Latte implements CoffeeMaker{


    private String name;


    public Latte() {
        this.name = "Latte";
    }


    public String getName() {
        return name;
    }

    @Override
    public String prepareRecipe() {
        return "Coffee - “Espresso 1/3 cup”\n" +
                "Mix –“Milk 2/3 cup”";
    }
}
