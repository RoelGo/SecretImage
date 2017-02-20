package com.cegekaschool.domain.secret;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.pineapple.Pineapple;

/**
 * Created by roelg on 17/02/2017.
 */
public class Secret {
    private Pineapple pineapple;
    private Photo photo;

    public Secret() {
    }

    public Secret(Pineapple pineapple, Photo photo) {
        this.pineapple = pineapple;
        this.photo = photo;
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

        if (pineapple != null ? !pineapple.equals(secret.pineapple) : secret.pineapple != null) return false;
        return photo != null ? photo.equals(secret.photo) : secret.photo == null;
    }

    @Override
    public int hashCode() {
        int result = pineapple != null ? pineapple.hashCode() : 0;
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }
}
