package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{


    private double discountedPrice;

    private double weightKG;
    private String dimensions;

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate,0.20);
        this.discountedPrice = getPrice() * capped;

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,double weightKG,String dimensions) {
        super(id, name, price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + "| Weight: " + weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }

    public double getWeightKG(){
        return weightKG;
    }
}
