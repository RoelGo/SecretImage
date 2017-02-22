package com.cegekaschool.domain.pineapple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by roelg on 17/02/2017.
 */
@Entity
public class Pineapple {
    @Id
    @Column(name="PINEAPPLE_ID")
    private long id;
    private String firstName;
    private String lastName;

    public Pineapple() {
    }

    public Pineapple(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
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

        if (id != pineapple.id) return false;
        if (firstName != null ? !firstName.equals(pineapple.firstName) : pineapple.firstName != null) return false;
        return lastName != null ? lastName.equals(pineapple.lastName) : pineapple.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
