public class StringInverter implements StringTransformer {
    private StringDrink drink;
    private boolean executed;

    StringInverter(StringDrink drink) {
        this.drink = drink;
        this.executed = false;
    }

    @Override
    public void execute() {
        String drink = this.drink.getText();
        StringBuffer newDrink = new StringBuffer(drink);
        newDrink.reverse();
        this.drink.setText(newDrink.toString());
        this.executed = true;
    }

    @Override
    public void undo() {
        if(this.executed)
            this.execute();
    }
}
