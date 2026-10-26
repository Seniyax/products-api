package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightKG;
    private String dimensions;


    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,double weightKG,String dimensions) {
        super(id, name, price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }


    public String getDimensions() {
        return dimensions;
    }

    public double getWeightKG(){
        return weightKG;
    }
}
