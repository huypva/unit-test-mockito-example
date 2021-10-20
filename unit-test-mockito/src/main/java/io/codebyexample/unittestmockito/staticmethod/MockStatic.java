package io.codebyexample.unittestmockito.staticmethod;

/**
 * @author huypva
 */
public class MockStatic {

  public String doMockStatic() {
    return "Static: " + StaticClass.doStaticMethod(1);
  }

}
