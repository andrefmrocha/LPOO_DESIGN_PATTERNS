public class HumanClient implements Client {

    private OrderingStrategy strategy;

    HumanClient(OrderingStrategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void wants(StringRecipe recipe, StringBar bar) {
        this.strategy.wants(recipe, bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        this.strategy.happyHourStarted(bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        this.strategy.happyHourStarted(bar);
    }
}
