import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ProductNotFoundException {

        Book javaForBeginners = new Book("Java for beginners", 800.4, ProductType.BOOK, "Kathy Sierra");
        Book learningJava = new Book("Learning Java", 1600.5, ProductType.BOOK, "Marc Loy");
        //Book invalidBook = new Book("not available", 0, ProductType.BOOK, "UNKNOWN");
        System.out.println(javaForBeginners.getDescription());
        System.out.println(learningJava.getDescription());

        Electronics mac = new Electronics("MacBook Pro M2", 79133.2, ProductType.ELECTRONICS, 36);
        Electronics vivobook = new Electronics("ASUS Vivobook Pro", 55603.2, ProductType.ELECTRONICS, 20);
        //Electronics invalid = new Electronics("some laptop", 0, ProductType.ELECTRONICS, 0);
        System.out.println(mac.getDescription());
        System.out.println(vivobook.getDescription());

        Clothes jeans = new Clothes("jeans Levis", 3000.4, ProductType.CLOTHING, 29,"blue");
        Clothes blouse = new Clothes("blouse", 1000.3, ProductType.CLOTHING, 36, "white");
        //Clothes invalidSize = new Clothes("children clothes", 3849.9, ProductType.CLOTHING, 10, "red");
        System.out.println(jeans.getDescription());
        System.out.println(blouse.getDescription());

        Food apple = new Food("apple golden", 46.5, ProductType.FOOD, 100, "sweet");
        Food chocolate = new Food("korona", 76.5, ProductType.FOOD, 90, "bitter");
        //Food invalidFood = new Food("not available food", 0, ProductType.FOOD, 0, "bitter");
        System.out.println(apple.getDescription());
        System.out.println(chocolate.getDescription());


        Store store = new Store();

        //add product of different dataTypes to the collection of products in the store
        store.addProduct(javaForBeginners);
        store.addProduct(learningJava);
        store.addProduct(mac);
        store.addProduct(vivobook);
        store.addProduct(apple);
        store.addProduct(chocolate);


        //get all products
        store.getAllProducts();
        System.out.println(store.getAllProducts());

        //remove products of particular name
        store.removeProduct("ASUS Vivobook Pro");
        System.out.println(store.getAllProducts());
        //store.removeProduct("lala"); // to initiate throwing exception


        //get products by type
        System.out.println(store.getProductsByType(ProductType.FOOD));

        //get product by name
        //System.out.println(store.findProductByName("apple golden"));

        Cart myCart = new Cart();
        myCart.addItemToCart(mac);
        myCart.addItemToCart(apple);
        System.out.println((myCart.viewCart()));



    }
}
