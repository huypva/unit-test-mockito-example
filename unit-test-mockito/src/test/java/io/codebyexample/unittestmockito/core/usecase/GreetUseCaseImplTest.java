package io.codebyexample.unittestmockito.core.usecase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import io.codebyexample.unittestmockito.core.entity.Greeting;
import io.codebyexample.unittestmockito.dataprovider.id.RandomIdProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author huypva
 */
@ExtendWith(SpringExtension.class)
@Import(GreetUseCaseImpl.class)
class GreetUseCaseImplTest {

  @Autowired
  GreetUseCaseImpl greetUseCase;

  @MockBean
  RandomIdProvider randomIdProvider;

  @Test
  void givenExistingGreetingWhenGreetThenReturnGreeting() {
    Greeting valueDefault = new Greeting(1, "Hello World!");
    given(randomIdProvider.genId()).willReturn(1);

    Greeting greeting = greetUseCase.greet("World");
    assertThat(valueDefault).usingRecursiveComparison().isEqualTo(greeting);
  }
}