package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private final StringProperty userName;
    private  StringProperty pw;
    private  StringProperty phoneNr;
    
    public User() {
    	this (null);
    }
    public User ( String userName) {
    	this.userName = new SimpleStringProperty(userName);
    	//this.pw = new SimpleStringProperty(pw);
    	//this.phoneNr = new SimpleStringProperty(phoneNr);
    }
    
    public String getUserName() {
        return userName.get();
    }

    public void setUserName(String userName) {
        this.userName.set(userName);
    }

    public StringProperty userNameProperty() {
        return userName;
    }
    
    public String getPassword() {
        return pw.get();
    }

    public void setPassword(String pw) {
        this.pw.set(pw);
    }

    public StringProperty passwordProperty() {
        return pw;
    }
    
    public String getPhoneNr() {
        return phoneNr.get();
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr.set(phoneNr);
    }

    public StringProperty phoneNrProperty() {
        return phoneNr;
    
    }
}
