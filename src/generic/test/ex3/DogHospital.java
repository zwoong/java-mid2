package generic.test.ex3;

import generic.animal.Dog;

public class DogHospital {
  private Dog animal;

  public void setAnimal(Dog animal) {
    this.animal = animal;
  }

  public void checkup() {
    System.out.println("동물 이름: " + animal.getName());
    System.out.println("동물 크기: " + animal.getSize());
    animal.sound();
  }

  public Dog bigger(Dog target) {
    return animal.getSize() > target.getSize() ? animal : target;
  }
}
