package org.samovich.cop2800.chapter11.assignment;

/**
 * Filename ManufacturedPart.java
 * Created on 3/2014 by R Grant
 * Updated on 6/25/2016 by Valery Samovich
 */
public class ManufacturedPart extends Part {
    // declare fields
    private double laborCost; // cost to make part (hours * rate)
    private double materialCost; // amount of material in product

    /**
     * Public constructor.
     */
    public ManufacturedPart() {
        super(0, DEFAULT_PART_DESCRIPTION, 0);
    }

    /**
     * Public constructor.
     * @param id
     */
    public ManufacturedPart(int id) {
        this(id, 0, 0);
    }

    /**
     * Public constructor.
     * @param id arguments for superclass
     * @param lCost arguments for superclass
     * @param mCost arguments for superclass
     */
    public ManufacturedPart(int id, double lCost, double mCost) {
        this(id, DEFAULT_PART_DESCRIPTION, 0, lCost, mCost);
    }

    /**
     * Public constructor.
     * @param id for superclass object
     * @param desc for superclass object
     * @param sellPrice for superclass object
     * @param lCost for this object
     * @param mCost for this object
     */
    public ManufacturedPart(int id, String desc, double sellPrice, double lCost, double mCost) {
        super(id, desc, sellPrice);
        this.setLaborCost(lCost);
        this.setMaterialCost(mCost);
    }

    /**
     *
     * @return
     */
    public double getLaborCost() {
        return laborCost;
    }

    /**
     *
     * @param laborCost
     */
    public void setLaborCost(double laborCost) {
        if (laborCost >= 0)
            this.laborCost = laborCost;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getMaterialCost() {
        return materialCost;
    }

    /**
     * Setter(mutator) method.
     * @param materialCost
     */
    public void setMaterialCost(double materialCost) {
        if (materialCost >= 0)
            this.materialCost = materialCost;
    }

    /**
     * Convert object information to string.
     * @return
     */
    public String toString() {
        return super.toString() + "\n" +
                "\tLabor Cost: " + this.getLaborCost() + "\n" +
                "\tMaterial Cost: " + this.getMaterialCost();
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getProductCost() {
        double mpProductCost;
        mpProductCost = laborCost + materialCost;
        return  mpProductCost;
    }
}
