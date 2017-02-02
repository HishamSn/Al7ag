package al7ag.z1tec.Shop;

/**
 * Created by SS on 1/26/2017.
 */

public class ShopModel
{
    private String ID;
    private String Name;
    private String Qty;
    private String Mobile;
    private String Location;
    //int status;


    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }




}
