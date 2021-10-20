package io.codebyexample.unittestmockito.staticmethod;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huypva
 */
@RunWith(SpringRunner.class)
class MockStaticTest {

  @Test
  void doMockStatic() {
    try (MockedStatic<StaticClass> mockedStatic = Mockito.mockStatic(StaticClass.class); ) {

      mockedStatic
          .when(() -> StaticClass.doStaticMethod(1))
          .thenReturn("1");

      MockStatic mockStatic = new MockStatic();
      Assertions.assertEquals("Static: 1", mockStatic.doMockStatic());
    }
  }
}