package io.codebyexample.unittestmockito.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class DataProviderTest {

  @Test
  void getCount() {
    DataProvider provider = new DataProvider();

    Assertions.assertEquals(0, provider.getCount());
  }

  @Test
  void increase() {
    DataProvider provider = new DataProvider();

    provider.increase(2);
    Assertions.assertEquals(2, provider.getCount());
  }
}