public class StringReplacer implements StringTransformer{
    private StringDrink drink;
    private char toReplace;
    private char replaceBy;
    private boolean executed;

    StringReplacer(StringDrink drink, char toReplace, char replaceBy){
        this.drink = drink;
        this.toReplace = toReplace;
        this.replaceBy = replaceBy;
    }


    @Override
    public void execute() {
        StringBuffer buffer = new StringBuffer(this.drink.getText().replace(this.toReplace, this.replaceBy));
        this.drink.setText(buffer.toString());
        this.executed = true;
    }

    @Override
    public void undo() {
        if(this.executed){
            StringBuffer buffer = new StringBuffer(this.drink.getText().replace(this.replaceBy, this.toReplace));
            this.drink.setText(buffer.toString());
        }
    }
}
