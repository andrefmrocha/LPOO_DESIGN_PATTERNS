public class StringReplacer implements StringTransformer{
    private StringDrink drink;
    private char toReplace;
    private char replaceBy;

    StringReplacer(StringDrink drink, char toReplace, char replaceBy){
        this.drink = drink;
        this.toReplace = toReplace;
        this.replaceBy = replaceBy;
    }


    @Override
    public void execute() {
        StringBuffer buffer = new StringBuffer(this.drink.getText().replace(this.toReplace, this.replaceBy));
        this.drink.setText(buffer.toString());
    }
}
