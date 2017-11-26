import java.util.List;

/**
 * Created by nader on 11/26/2017.
 */
public class Cashier {

    public static void order(List<Food> foods, List<Integer> quantity, boolean FoodOut){

        int sumPrice=0;
        for (int i=0; i<foods.size(); i++){
            System.out.println(quantity.get(i) +" number of "+ foods.get(i));
            sumPrice += sumPrice + foods.get(i).getPrice()*quantity.get(i);
        }
        System.out.println("Foods Sum Price : "+sumPrice);
        System.out.print("Final Cost(foods with service) : ");
        System.out.println(FoodOut?sumPrice:sumPrice*.2);
    }
}
