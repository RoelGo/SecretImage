package com.cegekaschool;

import com.cegekaschool.domain.pineapple.Pineapple;
import com.cegekaschool.domain.pineapple.PineappleRepository;
import com.cegekaschool.domain.pineapple.PineappleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecretImageApplicationTests {

	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@InjectMocks
	private PineappleService pineappleService;

	@Mock
	private PineappleRepository pineappleRepository;

	@Test
	public void addPineapple_ShouldCallPineappleRepository(){
		pineappleService.addPineapple("Christoph", "Marckx");

		Mockito.verify(pineappleRepository).addPineapple(new Pineapple("Christoph", "Marckx"));
	}
}


