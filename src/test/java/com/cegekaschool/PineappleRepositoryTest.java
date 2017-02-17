package com.cegekaschool;

import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xanv on 17/02/2017.
 */
public class PineappleRepositoryTest {
    private PineappleRepository pineappleRepository;
    Pineapple xan;
    Pineapple christoph;
    List<Pineapple> pineapples = new ArrayList<>();


    @Before
    public void setUp(){
        pineappleRepository = new PineappleRepository();
        xan = new Pineapple("Xan", "Vranckaert");
        christoph = new Pineapple("Christoph","Marckx");
        pineapples.add(christoph);
        pineapples.add(xan);
    }

    @Test
    public void getPineappleList(){
        pineappleRepository.addPineapple(xan);
        pineappleRepository.addPineapple(christoph);
        Assertions.assertThat(pineappleRepository.getAllPineapples()).isEqualTo(pineapples);
    }
}
