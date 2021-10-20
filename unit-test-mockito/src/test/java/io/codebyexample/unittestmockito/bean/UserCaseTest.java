package io.codebyexample.unittestmockito.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huypva
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class UserCaseTest {

  @MockBean
  DataProvider dataProvider;

  @Autowired
  UserCase userCase;

  @Test
  void voidMethod() {
    Mockito.doNothing().when(dataProvider).increase(1);

    userCase.voidMethod();
  }

  @Test
  void returnMethod() {
    Mockito.when(dataProvider.getCount())
        .thenReturn(2);

    Assertions.assertEquals(2, userCase.returnMethod());
  }
}