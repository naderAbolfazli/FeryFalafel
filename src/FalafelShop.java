
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nader on 11/26/2017.
 */
public class FalafelShop {
    static Boss fery = new Boss();

    public static void main(String[] args){

        Food pizza = new Food("pizza", 20000, "big");
        fery.addFood(pizza);
        Food berger = new Food("berger", 10000, "medium");
        fery.addFood(berger);
        Food falafel = new Food("falafel", 2000, "medium");
        fery.addFood(falafel);

        List<Food> firstOrder = new ArrayList<>();
        firstOrder.add(fery.getFood("pizza"));
        firstOrder.add(fery.getFood("falafel"));
        List<Integer> quantity = new ArrayList<>();
        quantity.add(1);
        quantity.add(3);

        //food out
        System.out.println("Order1");
        Cashier.order(firstOrder, quantity, true);

        fery.changePrice("falafel", 2500);
        fery.addIngredient("pizza", "cheese");
        List<String> fIngr = new ArrayList<>();
        fIngr.add("falafel");
        fIngr.add("khiarShoor");
        fIngr.add("goje");

        fery.addCompeletlyNewIngredient("falafel",fIngr );

        List<Food> secondOrder = new ArrayList<>();
        secondOrder.add(fery.getFood("pizza"));
        secondOrder.add(fery.getFood("falafel"));

        System.out.println("//////////////////////////");
        System.out.println("Order2");
        Cashier.order(secondOrder, quantity, false);


    }
}
