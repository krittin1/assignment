package exam;

public class Mocha implements CoffeeMaker{

    private String name;


    public Mocha() {
        this.name = "Mocha";
    }


    public String getName() {
        return name;
    }


    @Override
    public String prepareRecipe() {
        return "Coffee – “Espresso 1/3 cup”\n" +
                "Mix – “Chocolate 1/3 cup” , “Milk 1/3 cup”";
    }
}
