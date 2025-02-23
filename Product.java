public abstract class Product {
    protected String name;
    protected double price;
    protected ProductType type;

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        if (price < 0.01) {
            throw new RuntimeException("The price can't be less than 0.01");
        }
        else{
            this.price = price;
        }
    }

    public void setType(ProductType type){
        this.type = type;
    }

    public ProductType getType(){
        return type;
    }

    public double getPrice(){
        return price;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price  + ", type='" + type;
    }
}
