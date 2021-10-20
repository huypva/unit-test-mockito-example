package io.codebyexample.unittestmockito.staticmethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class StaticClassTest {

  @Test
  void doStaticMethod() {

    String output = StaticClass.doStaticMethod(1);

    Assertions.assertEquals("Output: 1", output);
  }
}