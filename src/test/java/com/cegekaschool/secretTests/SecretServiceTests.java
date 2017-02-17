package com.cegekaschool.secretTests;

import com.cegekaschool.domain.secret.Secret;
import com.cegekaschool.domain.secret.SecretRepository;
import com.cegekaschool.domain.secret.SecretService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

/**
 * Created by roelg on 17/02/2017.
 */
public class SecretServiceTests {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private SecretService testSecretService;
    @Mock
    private SecretRepository secretRepository;
    @Mock
    private Secret testSecret1;

    @Test
    public void CheckIf_SecretService_Calls_SecretRepositryAddMethod(){
        testSecretService.addSecret(testSecret1);
        verify(secretRepository).addSecret(testSecret1);

    }
    @Test
    public void CheckIf_SecretService_Calls_SecretRepositryGetALlMethod(){
        testSecretService.getAllSecrets();
        verify(secretRepository).getAllSecrets();

    }
}
