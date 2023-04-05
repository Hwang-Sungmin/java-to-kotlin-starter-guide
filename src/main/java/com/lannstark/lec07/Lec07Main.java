package com.lannstark.lec07;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Lec07Main {

  public static void main(String[] args) throws IOException {
  }
  private Integer parseIntoThrowV2(@NotNull String str){
    try{
      return Integer.parseInt(str);

    }catch (NumberFormatException e){
      return null;
    }
  }

}
