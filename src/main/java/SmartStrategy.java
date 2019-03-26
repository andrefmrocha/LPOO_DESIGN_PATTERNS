import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringRecipe> recipes = new ArrayList<>();

    @Override
    public void wants(StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour())
            recipe.mix();
        else
            this.recipes.add(recipe);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        this.mixDrinks();
    }

    @Override
    public void happyHourEnded(Bar bar) {
    }

    private void mixDrinks(){
        for(StringRecipe recipe: this.recipes)
            recipe.mix();
    }
}
