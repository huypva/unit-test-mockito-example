package io.codebyexample.unittestmockito.core.usecase;

import io.codebyexample.unittestmockito.core.entity.Greeting;

/**
 * @author huypva
 */
public interface GreetUseCase {

  Greeting greet(String name);
}
