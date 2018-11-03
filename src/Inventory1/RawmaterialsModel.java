
package Inventory1;

/**
 *
 * @author Dharshika
 */
public class RawmaterialsModel {
    private int code;
    private String category;
    private String subcategory;
    private String name;
    private String color;
    private String unitmeasure;
    private double startinv;
    private double reorder;
    private double cost;
    private double stockqty;
    private String orderstatus;
    private byte[]  myimage;
    
    
    
    public RawmaterialsModel(int Code, String Category, String Subcategory, String Name, String Color, String Unitmeasure, double Startinv, double Reorder, double Cost, double Stockqty, String Orderstatus,byte[] MyImage)
    {
        this.code=Code;
        this.category=Category;
        this.subcategory=Subcategory;
        this.name=Name;
        this.color=Color;
        this.unitmeasure=Unitmeasure;
        this.startinv=Startinv;
        this.reorder=Reorder;
        this.cost=Cost;
        this.stockqty=Stockqty;
        this.orderstatus=Orderstatus;
        this.myimage=MyImage;


        
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the subcategory
     */
    public String getSubcategory() {
        return subcategory;
    }

    /**
     * @param subcategory the subcategory to set
     */
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the unitmeasure
     */
    public String getUnitmeasure() {
        return unitmeasure;
    }

    /**
     * @param unitmeasure the unitmeasure to set
     */
    public void setUnitmeasure(String unitmeasure) {
        this.unitmeasure = unitmeasure;
    }

    /**
     * @return the startinv
     */
    public double getStartinv() {
        return startinv;
    }

    /**
     * @param startinv the startinv to set
     */
    public void setStartinv(double startinv) {
        this.startinv = startinv;
    }

    /**
     * @return the reorder
     */
    public double getReorder() {
        return reorder;
    }

    /**
     * @param reorder the reorder to set
     */
    public void setReorder(double reorder) {
        this.reorder = reorder;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the stockqty
     */
    public double getStockqty() {
        return stockqty;
    }

    /**
     * @param stockqty the stockqty to set
     */
    public void setStockqty(double stockqty) {
        this.stockqty = stockqty;
    }

    /**
     * @return the orderstatus
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     * @param orderstatus the orderstatus to set
     */
    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }
    
    
      public byte[] getMyImage() {
        return myimage;
    }

    /**
     * @param category the category to set
     */
    public void setMyImage(byte[] myimage) {
        this.myimage = myimage;
    }

    
    
}
