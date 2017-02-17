package com.cegekaschool.secretTests;

import com.cegekaschool.domain.photo.Photo;
import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.HashSet;

//import org.assertj.core.api.Assertions;


/**
 * Created by roelg on 17/02/2017.
 */
public class SecretRepositoryTests {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    SecretRepository secretRepository;
    @Mock
    private Photo photo;
    @Mock
    private Pineapple pineapple;

    @Before
    public void setUp() throws Exception {

        secretRepository = new SecretRepository();

    }

    @Test
    public void TestIfgetAllSecretsReturnsListOfSecrets() {
        Class actual = secretRepository.getAllSecrets().getClass();
        Class expected = new HashSet<Secret>().getClass();
        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void checkIfAddSecretAddsSecretToSecretsRepositorySet() {
        Secret testSecret = new Secret(pineapple, photo);
        Assertions.assertThat(secretRepository.addSecret(testSecret)).isEqualTo(true);


    }

    @Test
    public void checkIfSameSecretCantBeAddedToSecretsRepositorySet() {
        Secret testSecret = new Secret(pineapple, photo);
        secretRepository.addSecret(testSecret);
        Assertions.assertThat(secretRepository.addSecret(testSecret)).isEqualTo(false);


    }

}
