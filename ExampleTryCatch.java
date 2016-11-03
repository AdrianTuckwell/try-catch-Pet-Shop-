public class ExampleTryCatch{
  PetShop shop;

  public void run(){
    setup();
    Pet found = null;
    
    // try-catch exception
    try {
          // found = shop.findPetByName("Meowingtons");
          found = shop.findPetByName(null);
    }
                              // ex is for exception which is convention
    catch (NullStringException ex) {
      ex.printStackTrace();
      System.out.println("Exceltion message:");
      System.out.println( ex.getMessage());
    }
    
    System.out.println("Found pet: " + found.getName());
  }

  public void setup(){
    shop = new PetShop();
    shop.addPet(new Dog("Rover"));
    shop.addPet(new Cat("MEOWingtons"));
    shop.addPet(new Fish("FINlay"));
  }
}
