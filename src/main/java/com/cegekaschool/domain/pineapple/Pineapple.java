package com.cegekaschool.domain.pineapple;

/**
 * Created by roelg on 17/02/2017.
 */
public class Pineapple {
    private String firstName;
    private String lastName;

    public Pineapple() {
    }

    public Pineapple(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pineapple pineapple = (Pineapple) o;

        if (!firstName.equals(pineapple.firstName)) return false;
        return lastName.equals(pineapple.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
