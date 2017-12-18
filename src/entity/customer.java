/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DANSO
 */
public class customer {
    private String cusId;
    private String cusPass;
    private String cusName;
    private int phoneNo;
    private String cusAddress;
    private int posCode;
    

    public customer(String cusId, String cusPass, String cusName, int phoneNo, String cusAddress, int posCode) {
        this.cusId = cusId;
        this.cusPass = cusPass;
        this.cusName = cusName;
        this.phoneNo = phoneNo;
        this.cusAddress = cusAddress;
        this.posCode = posCode;
    }

    public String getCusId() {
        return cusId;
    }

    public String getCusPass() {
        return cusPass;
    }

    public String getCusName() {
        return cusName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public int getPosCode() {
        return posCode;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public void setCusPass(String cusPass) {
        this.cusPass = cusPass;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public void setPosCode(int posCode) {
        this.posCode = posCode;
    }
    

}
