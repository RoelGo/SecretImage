package com.cegekaschool.domain.photo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by roelg on 17/02/2017.
 */
@Entity
public class Photo {
    @Id
    @Column(name="PHOTO_ID")
    Long id;
    String photoLocation;

    public Photo() {
    }

    public Photo(Long id, String photoLocation) {
        this.id = id;
        this.photoLocation = photoLocation;
    }

    public Photo(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        if (id != null ? !id.equals(photo.id) : photo.id != null) return false;
        return photoLocation != null ? photoLocation.equals(photo.photoLocation) : photo.photoLocation == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (photoLocation != null ? photoLocation.hashCode() : 0);
        return result;
    }
}
