public class ImpatientStrategy implements OrderingStrategy{
    private boolean happyHour;
    @Override
    public void wants(StringRecipe recipe, StringBar bar) {
        recipe.mix();
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        this.happyHour = true;
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        this.happyHour = false;
    }
}
