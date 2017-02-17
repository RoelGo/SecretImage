package com.cegekaschool.pineappleTests;

import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleRepository;
import com.cegekaschool.domain.pineapple.PineappleService;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by xanv on 17/02/2017.
 */
public class PineappleServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private PineappleService pineappleService;

    @Mock
    private PineappleRepository pineappleRepository;
    Pineapple pineapple;
    List<Pineapple> pineapples = new ArrayList<Pineapple>();

    @Test
    public void addPineapple_ShouldCallPineappleRepository(){
        pineappleService.addPineapple("Christoph", "Marckx");

        Mockito.verify(pineappleRepository).addPineapple(new Pineapple("Christoph", "Marckx"));
    }

    @Test
    public void getListPineapples_ShouldCallPineappleRepository(){
        pineappleService.getAllPineapples();
        Mockito.verify(pineappleRepository).getAllPineapples();
    }
}
