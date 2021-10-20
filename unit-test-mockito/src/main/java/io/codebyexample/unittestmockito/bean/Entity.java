package io.codebyexample.unittestmockito.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author huypva
 */
@ToString
@Getter
@AllArgsConstructor
public class Entity  {

  private int id;
  private String message;
}