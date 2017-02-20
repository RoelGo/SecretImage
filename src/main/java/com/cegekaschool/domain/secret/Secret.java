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
}
