package com.cegekaschool.domain.secret;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by roelg on 22/02/2017.
 */
public interface SecretDatabaseRepository extends CrudRepository<Secret, Long> {
}
