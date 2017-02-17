package bicycle;

class MaterialTest{
   public static void main(String... args){
      TestGetDensity();
      TestGetStrength();
      TestGetName();
      System.out.println("All tests passed");
   }

   static void TestGetDensity(){
      System.out.println("testing getDesity");
      Material material = new Material(null,10.0,0);
      assert(material.getDensity() == 10.0);
   }

   static void TestGetStrength(){
      System.out.println("testing getStrength");
      Material material = new Material(null,0,10.0);
      assert(material.getStrength() == 10.0);
   }

   static void TestGetName(){
      System.out.println("testing getName");
      Material material = new Material("steel",0,0);
      assert(material.getName() == "steel");
   }
}
