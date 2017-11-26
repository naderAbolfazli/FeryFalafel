import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
