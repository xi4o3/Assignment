/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author MSI-
 */
public class DeliveryMan {
    private int manID;
    private String pw;
    private static int nextManID = 0001;
    private String name;
    private String contactNum;
    private String adds;
    private String status;

    public DeliveryMan() {
    }

    public DeliveryMan(int manID, String name) {
        this.manID =  nextManID++;
        this.name = name;
    }

    public DeliveryMan(String name) {
        this.manID = nextManID++;
        this.name = name;
    }

    public DeliveryMan(int manID, String name, String pw,String contactNum, String adds, String status) {
        this.manID = nextManID++;
        this.pw = pw;
        this.name = name;
        this.contactNum = contactNum;
        this.adds = adds;
        this.status = status;
    }
    
    public int getManID() {
        return manID;
    }

    public void setManID(int manID) {
        this.manID = nextManID++;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public static int getNextManID() {
        return nextManID;
    }

    public static void setNextManID(int nextManID) {
        DeliveryMan.nextManID = nextManID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
        return String.format("No. %-10d %-20s %-20s %-20s  %-20s ", manID, name,contactNum,adds,status);
    }
    
    
    
}
