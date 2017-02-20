package com.cegekaschool.domain.photo;

/**
 * Created by roelg on 17/02/2017.
 */
public class Photo {
    String photoLocation;

    public Photo() {
    }

    public Photo(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    @Override
    public boolean equals(Object o) {   
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        return photoLocation != null ? photoLocation.equals(photo.photoLocation) : photo.photoLocation == null;
    }

    @Override
    public int hashCode() {
        return photoLocation != null ? photoLocation.hashCode() : 0;
    }
}
