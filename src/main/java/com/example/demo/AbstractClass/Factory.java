package com.example.demo.AbstractClass;

public abstract class Factory {

  public final Animal create(String variants) {
    Animal animal = createAnimal(variants);
    return animal;
  }

  protected abstract Animal createAnimal(String variants);

}
