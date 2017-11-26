import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nader on 11/26/2017.
 */
public class Food {
    private String name;
    private int price;
    private List<String> ingredient= new ArrayList<>();
    private String size;

    public Food(String name){
        this.name = name;
    }
    public Food(String name, int price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public void addIngredient(String ingredient) {
        this.ingredient.add(ingredient);
    }

    public void addIngredient(List<String> ingredient) {
        for (String ing: ingredient
             ) {
            this.ingredient.add(ing);
        }
    }

    public boolean removeIngredient(String ingredient) {
        int index = findIng(ingredient);
        if (index>=0){
            this.ingredient.remove(index);
        }
        return false;
    }

    private int findIng(String ingredient) {
        for (int i=0; i<this.ingredient.size(); i++)
            if (this.ingredient.get(i).equals(ingredient))
                return i;

        return -1;
    }

    public void removeAllIngredient(){
        for (int i=0; i<ingredient.size(); i++){
            ingredient.remove(i);
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredient=" + ingredient +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return name.equals(food.name);
    }

}
