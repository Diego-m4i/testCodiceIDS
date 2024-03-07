package it.cs.unicam.ids.entities;

import java.util.ArrayList;
import java.util.Calendar;

public class User {

    private int identifier;

    private String nickName;

    private String email;

    private Calendar dateOfBirth;

    private String placeOfBirth;

    private Role role;

    //private ArrayList<POI> favourites;

    public User(String nickName, String email, Calendar dateOfBirth, String placeOfBirth, Role role) {
        this.nickName = nickName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.role = role;
        this.identifier = this.hashCode();
        /**
        if(role == Role.AUTHENTICATED_TOURIST)
            this.favourites = new ArrayList<POI>();
         */

    }

    // OPERATIONS

    // createPOI

    public void createPOI(){

    }

    // verifyPOI
    // getPOI

    // UTILITIES

    public int getIdentifier() { return identifier; }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int hashCode(){ return this.nickName.hashCode() + this.email.hashCode(); }

}
