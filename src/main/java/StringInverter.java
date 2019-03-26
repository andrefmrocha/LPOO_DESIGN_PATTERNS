public class StringInverter implements StringTransformer {
    private StringDrink drink;

    StringInverter(StringDrink drink) {
        this.drink = drink;
    }

    @Override
    public void execute() {
        String drink = this.drink.getText();
        StringBuffer newDrink = new StringBuffer(drink);
        newDrink.reverse();
        this.drink.setText(newDrink.toString());
    }
}
