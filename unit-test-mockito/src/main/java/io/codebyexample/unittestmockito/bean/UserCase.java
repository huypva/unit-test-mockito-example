package io.codebyexample.unittestmockito.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Slf4j
@Component
public class UserCase {

  @Autowired
  private DataProvider dataProvider;

  public void voidMethod() {
    dataProvider.increase(1);
  }

  public int returnMethod() {
    int count = dataProvider.getCount();

    return count;
  }


}
