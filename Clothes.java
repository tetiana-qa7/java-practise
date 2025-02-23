public class Clothes extends Product{

    int size;
    String color;

    public Clothes(String name, double price, ProductType type, int size, String color){
        setName(name);
        setPrice(price);
        setType(type);
        setSize(size);
        setColor(color);
    }

    public void setSize(int size){
        if(size < 20){
            throw new RuntimeException("This size doesn't exist");
        }
        else{
            this.size = size;
        }
    }

    public int getSize(){
        return size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String getDescription() {
        return "name of the clothes: " + getName() + ", price of the clothes: " + getPrice() + ", product type: " + getType() +  ", size: " + getSize() + ", color of clothes: " + getColor();
    }

    @Override
    public String toString() {
        return super.toString() + ", size='" + size + ", color='" + color + "'}";
    }
}
