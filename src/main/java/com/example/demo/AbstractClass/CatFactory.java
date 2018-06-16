package com.example.demo.AbstractClass;

public class CatFactory extends Factory{
  protected Cat createAnimal(String variants){
    return new Cat(variants);
  }

}
