/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.BusinessInformation;

/**
 *
 * @author jerem
 */
public class BusinessInformation {

    private String buisnessName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public BusinessInformation(String buisnessName, String address, String city, String state, String zip, String phoneNumber) {
        this.buisnessName = buisnessName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public final String getBuisnessName() {
        return buisnessName;
    }

    public void setBuisnessName(String buisnessName) {
        this.buisnessName = buisnessName;
    }

    public final String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public final String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public final String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public final String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
