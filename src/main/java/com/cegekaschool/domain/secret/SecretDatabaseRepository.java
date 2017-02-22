package com.cegekaschool.domain.secret;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.pineapple.Pineapple;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by roelg on 22/02/2017.
 */
public interface SecretDatabaseRepository extends CrudRepository<Secret, Long> {
    Secret findByPineappleAndPhoto(Pineapple pineapple, Photo photo);
}
