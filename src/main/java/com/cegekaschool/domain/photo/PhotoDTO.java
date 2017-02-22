package com.cegekaschool.domain.photo;

/**
 * Created by roelg on 22/02/2017.
 */
public class PhotoDTO {
    String photoLocation;

    public PhotoDTO() {
    }

    public PhotoDTO(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoDTO photoDTO = (PhotoDTO) o;

        return photoLocation != null ? photoLocation.equals(photoDTO.photoLocation) : photoDTO.photoLocation == null;
    }

    @Override
    public int hashCode() {
        return photoLocation != null ? photoLocation.hashCode() : 0;
    }
}
