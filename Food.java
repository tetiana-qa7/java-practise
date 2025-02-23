public class Food extends Product {
    int weight;
    String taste;

    public Food(String name, double price, ProductType type, int weight, String taste){
        setName(name);
        setPrice(price);
        setType(type);
        setWeight(weight);
        setTaste(taste);
    }

    public void setWeight(int weight){
        if (weight < 1){
            throw new RuntimeException("The weight you provided is invalid");
        }
        else{
            this.weight = weight;
        }
    }

    public int getWeight(){
        return weight;
    }

    public void setTaste(String taste){
        this.taste = taste;
    }

    public String getTaste(){
        return taste;
    }

    @Override
    public String getDescription() {
        return "name of the food:" + getName() + ", price of the food: " + getPrice() + ", product type: " + getType() +  ", weight: " + getWeight() + ", taste of food: " + getTaste();
    }

    @Override
    public String toString() {
        return super.toString() + ", weight='" + weight + ", taste='" + taste + "'}";
    }
}
