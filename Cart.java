import java.util.ArrayList;
import java.util.List;

public class Cart<T extends Product>{
    private List<T> items = new ArrayList<>();

    public void addItemToCart(T item) {
        items.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public List<T> viewCart() {
        return items;
    }
}


//1. Створи клас **`Cart`**, який використовує **дженеріки** для роботи з товарами різних типів.
//    - Клас **`Cart`** має метод **`addItemToCart(Product item)`**, який додає товар до кошика.
//    - Метод **`viewCart()`**, який повертає список товарів у кошику.