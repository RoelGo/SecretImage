package com.cegekaschool.domain.secret;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.photo.PhotoDTO;
import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleDTO;

/**
 * Created by roelg on 22/02/2017.
 */
public class SecretDTO {

    private PineappleDTO pineapple;
    private PhotoDTO photo;

    private SecretDTO() {
    }

    public SecretDTO(PineappleDTO pineapple, PhotoDTO photo) {
        this.pineapple = pineapple;
        this.photo = photo;
    }

    public PhotoDTO getPhoto() {
        return photo;
    }

    public PineappleDTO getPineapple() {
        return pineapple;
    }
}

