package com.cegekaschool.domain.photo;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by roelg on 22/02/2017.
 */
@Named
public class PhotoService {


    private final AtomicLong counter = new AtomicLong();
    @Inject
    PhotoDatabaseRepository photoRepository;

    public Iterable<Photo> getAllPineapples() {
        return photoRepository.findAll();
    }

    public Photo addPhoto(String photoLocation) {
        Photo output = new Photo(counter.incrementAndGet(), photoLocation);
        photoRepository.save(output);
        return output;
    }
}
