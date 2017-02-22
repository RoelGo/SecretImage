package com.cegekaschool.domain;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.photo.PhotoDTO;
import com.cegekaschool.domain.photo.PhotoService;
import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleDTO;
import com.cegekaschool.domain.pineapple.PineappleService;
import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretDTO;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by roelg on 22/02/2017.
 */
@Named
public class Mapper {

    @Inject
    private PineappleService pineappleService;

    @Inject
    private PhotoService photoService;


    public Secret mapSecret(Long id, SecretDTO secretDTO) {
        return new Secret(id, mapPineapple(secretDTO.getPineapple()), mapPhoto(secretDTO.getPhoto()));
    }

    public Photo mapPhoto(PhotoDTO photo) {
        return photoService.addPhoto(photo.getPhotoLocation());
    }

    public Pineapple mapPineapple(PineappleDTO pineappleDTO) {
        return pineappleService.addPineapple(pineappleDTO.getFirstName(), pineappleDTO.getLastName());
    }

}
