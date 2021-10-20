package io.codebyexample.unittestmockito.bean;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Slf4j
@AllArgsConstructor
@Component
public class DataProvider {

  int count;

  public DataProvider() {
    count = 0;
  }

  public int getCount() {
    return count;
  }

  public void increase(int delta) {
    count += delta;
  }
}
