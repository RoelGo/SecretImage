package com.cegekaschool.domain.pineapple;

/**
 * Created by roelg on 22/02/2017.
 */
public class PineappleDTO {
    private String firstName;
    private String lastName;

    public PineappleDTO() {
    }

    public PineappleDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Pineapple toPineapple(long id) {
        return new Pineapple(id, getFirstName(), getLastName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PineappleDTO that = (PineappleDTO) o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
