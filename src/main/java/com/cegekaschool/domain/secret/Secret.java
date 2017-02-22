package com.cegekaschool.domain.secret;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.pineapple.Pineapple;

import javax.persistence.*;

/**
 * Created by roelg on 17/02/2017.
 */
@Entity
public class Secret {

    @Id
    @Column(name = "SECRET_ID")
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Pineapple pineapple;
    @ManyToOne(cascade = CascadeType.ALL)
    private Photo photo;

    private Secret() {
    }

    public Secret(long id, Pineapple pineapple, Photo photo) {
        this.id = id;
        this.pineapple = pineapple;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public Pineapple getPineapple() {
        return pineapple;
    }

    public Photo getPhoto() {
        return photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Secret secret = (Secret) o;

        if (id != secret.id) return false;
        if (pineapple != null ? !pineapple.equals(secret.pineapple) : secret.pineapple != null) return false;
        return photo != null ? photo.equals(secret.photo) : secret.photo == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (pineapple != null ? pineapple.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }


}
