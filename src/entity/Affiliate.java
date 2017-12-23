/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Wingent
 */

public class Affiliate implements Comparable<Affiliate>
{
    private String Res_id;
    private String Res_name;
    private String Owner_name;
    private String contact_no;
    private String password;
    private String address;

    public Affiliate(String Res_id, String password, String Res_name, String Owner_name, String contact_no, String address) {
        this.Res_id = Res_id;
        this.Res_name = Res_name;
        this.Owner_name = Owner_name;
        this.contact_no = contact_no;
        this.password = password;
        this.address = address;
    }

    public String getRes_id() {
        return Res_id;
    }

    public void setRes_id(String Res_id) {
        this.Res_id = Res_id;
    }

    public String getRes_name() {
        return Res_name;
    }

    public void setRes_name(String Res_name) {
        this.Res_name = Res_name;
    }

    public String getOwner_name() {
        return Owner_name;
    }

    public void setOwner_name(String Owner_name) {
        this.Owner_name = Owner_name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString()
    {
        return String.format(" %10s %20s %20s %20s %25s\n",Res_id, Res_name, Owner_name, address, contact_no);
    }
    
    @Override
    public int compareTo(Affiliate affiliate) {
        if(Res_name.compareTo(affiliate.getRes_name()) < 0)
        {
            return 1;
        }
        else if(Res_name.compareTo(affiliate.getRes_name()) == 0)
        {
                return 0;
        }            
        else
        {
                return -1;
        }
    }
}
