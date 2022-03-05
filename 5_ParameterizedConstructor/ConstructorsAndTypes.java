

public class ConstructorsAndTypes {
    int modelYear;
    String modelName;
  
    public ConstructorsAndTypes(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
        ConstructorsAndTypes myCar = new ConstructorsAndTypes(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }