import java.util.ArrayList;
import java.util.List;

/**
 * Created by nader on 11/26/2017.
 */
public class Boss {
    List<Food> foods = new ArrayList<>();

    public void addFood(Food food){
        foods.add(food);
    }

    public Food getFood(String name){
        int index= findFood(name);
        if (index>=0)
            return foods.get(index);
        return null;
    }

    public boolean removeFood(String name){
        int index =findFood(name);
        if (index>=0){
            foods.remove(index);
            return true;
        }
        return false;
    }

    private int findFood(String name) {
        for (int i=0; i<foods.size(); i++)
            if (foods.get(i).getName().equals(name))
                return i;
        return -1;
    }

    public boolean changePrice(String name ,int newPrice){
        int index = findFood(name);
        if (index>=0){
            foods.get(index).setPrice(newPrice);
            return true;
        }
        return false;
    }

    public boolean addIngredient(String name, String newIngredient){
        int index = findFood(name);
        if (index>=0){
            foods.get(index).addIngredient(newIngredient);
            return true;
        }
        return false;
    }

    public boolean removeIngredient(String name, String ingredient){
        int index = findFood(name);
        if (index>=0){
            if (foods.get(index).removeIngredient(ingredient))
                return true;
        }
        return false;
    }

    public boolean addCompeletlyNewIngredient(String foodName, List<String> ingredient){
        int index = findFood(foodName);
        if (index>=0){
            foods.get(index).removeAllIngredient();
            foods.get(index).addIngredient(ingredient);
            return true;
        }
        return false;
    }

}
