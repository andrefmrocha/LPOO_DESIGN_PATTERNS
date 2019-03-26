public class StringCaseChanger implements StringTransformer{
    private StringDrink drink;
    private boolean executed;

    StringCaseChanger(StringDrink drink){

        this.drink = drink;
    }

    @Override
    public void execute() {
        String drink = this.drink.getText();
        StringBuffer buffer = new StringBuffer();
        for(char c: drink.toCharArray()){
            if(Character.isLowerCase(c))
                buffer.append(Character.toUpperCase(c));
            else
                buffer.append(Character.toLowerCase(c));
        }
        this.drink.setText(buffer.toString());
        this.executed = true;
    }

    @Override
    public void undo() {
        if(this.executed)
            this.execute();
    }
}
