package com.firstspring.model;

public class User {
    public String firstName;
    public String lastName;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String name) {
        this.firstName=name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String str = (firstName != null) ? firstName+" ":" ";
        str +=(lastName != null)?lastName:"";
        return str.trim();
    }
       /* return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';*/

}
