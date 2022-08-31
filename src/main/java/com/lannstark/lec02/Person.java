package com.lannstark.lec02;

import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  // @NotNull // 코틀린에서 사용할때도 nullable
//@Nullable // 코틀린에서 사용할때도 not null
  public String getName() {
    return name;
  }

}


