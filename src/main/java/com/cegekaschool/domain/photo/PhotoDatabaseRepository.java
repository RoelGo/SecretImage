package com.cegekaschool.domain.photo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by roelg on 22/02/2017.
 */
public interface PhotoDatabaseRepository extends CrudRepository<Photo, Long> {
    Photo findByPhotoLocation(String photoLocation);
}
