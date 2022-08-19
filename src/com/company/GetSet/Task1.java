package com.company.GetSet;

public class Task1 {
    /*Implement two null-safety setters and one calculated getter in the following ways:
both setters should accept and set a value if it is not null or an empty string "";
the getter should return the full name of the user by concatenating firstName and lastName using a single space between them.
If one of the parts was not set, the getter should return only the other part without additional spaces.
If both parts are empty, the getter should return the word "Unknown".*/
}

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName; // write your code here
        }
    }
}