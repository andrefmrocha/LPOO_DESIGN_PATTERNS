public class ImpatientStrategy implements OrderingStrategy{
    private boolean happyHour;
    @Override
    public void wants(StringRecipe recipe, StringBar bar) {
        recipe.mix();
    }

    @Override
    public void happyHourStarted(Bar bar) {
        this.happyHour = true;
    }

    @Override
    public void happyHourEnded(Bar bar) {
        this.happyHour = false;
    }
}
