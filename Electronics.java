public class Electronics extends Product {
    private  int warrantyPeriod;

    public Electronics(String name, double price, ProductType type, int warrantyPeriod){
        setName(name);
        setPrice(price);
        setType(type);
        setWarrantyPeriod(warrantyPeriod);
    }

    public void setWarrantyPeriod(int warrantyPeriod){
        if (warrantyPeriod < 1){
            throw new RuntimeException("Warranty period can't be less than 1");
        }
        else {
            this.warrantyPeriod = warrantyPeriod;}
    }

    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }


    @Override
    public String getDescription(){
        return "name of the electronics :" + getName() + ", price of the electonics: " + getPrice() + ", product type: " + getType() +  ", warrantyPeriod: " + getWarrantyPeriod();
    }

    @Override
    public String toString() {
        return super.toString() + ", warranty period='" + warrantyPeriod +  "'}";
    }


}
