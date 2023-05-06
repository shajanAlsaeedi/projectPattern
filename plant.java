package palntworldstage2;
/**
 * plant class : this class for plant information . take all information and
 * displaying
 */
// three size if plants.
enum Size {
    small, medium, large
};

public class plant  {

    private String namePlant;
    private Size sizePlant;
    private double pricePlant;

    /**
     * Default Constructor #1.
     */
    public plant() {

        this.namePlant = "";

    }

    /**
     * Constructor #2.
     *
     * @param namePlant
     * @param sizePlant
     * @param pricePlant .
     */
    public plant(String namePlant, double pricePlant) {
        this.namePlant = namePlant;
        //this.sizePlant = sizePlant;
        this.pricePlant = pricePlant;
    }
    //bulider
        plant(Builder builder) {
        this.namePlant = builder.namePlant;
        this.sizePlant = builder.sizePlant;
        this.pricePlant = builder.pricePlant;
    }

    /**
     * Method getNamePlant @return namePlant.
     */
    public String getNamePlant() {
        return namePlant;
    }

    /**
     * Method setNamePlant @param namePlant.
     */
    public void setNamePlant(String namePlant) {
        this.namePlant = namePlant;
    }

    /**
     * Method getSizePlant @return sizePlant.
     */
    public Size getSizePlant() {
        return sizePlant;
    }

    /**
     * Method getPricePlant @return pricePlant.
     */
    public double getPricePlant() {
        return pricePlant;
    }

    /**
     * Method setPricePlant @param pricePlant.
     */
    public void setPricePlant(double pricePlant) {

        this.pricePlant = pricePlant;
    }
    //builder method
    public static Builder builder() {
        return new Builder();
    }
    /**
     * Method toString @raturn text want displaying.
     */
    public String toString() {
        return "\n\t ***** PLANT Information ***** \t\n"
                + "Name :" + namePlant + "\nSize :" + sizePlant
                + "\nPrice : " + pricePlant;
    }

    /**
     * Print all details in class ..
     */
    public void PrintDetails() {
        System.out.println(toString());

    }

}
