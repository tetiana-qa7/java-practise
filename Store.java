import java.util.Set;
import java.util.HashSet;

public class Store {
    private Set<Product> products = new HashSet<>();

    public Set<Product> addProduct(Product product){
        products.add(product);
        return products;
    }
    //додає товар до колекції

    public Set<Product> getAllProducts(){
        return products;
    }
    //повертає всі товари в магазині

    public Set<Product> removeProduct(String name) throws ProductNotFoundException{
        /*     for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
            }
        }
        return products;*/

        /* products.removeIf(product -> product.getName().equals(name));
        return products;
        */

        //?? needs clarification
        boolean wasRemovedBecauseOfName = products.removeIf(product -> product.getName().equals(name));
        if (wasRemovedBecauseOfName){
            return products;
        }
        else{
            throw new ProductNotFoundException("Our store doesn't have the product with the provided name");
        }
    }
    //видаляє товар за назвою (з обробкою виключень).

    public Product findProductByName(String name) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
            else {
                throw new ProductNotFoundException("Our store doesn't have the product with the provided name");
            }
            //I know it's an error, i just can't understand why
        }
        return null;
    }

    public Set<Product> getProductsByType(ProductType type) {
        Set<Product> filteredSet = new HashSet<>();
        for (Product product : products) {
            if (product.getType().equals(type)) {
                filteredSet.add(product);
            }
        }
        return filteredSet;
    }
    //повертає список товарів певного типу.
}




