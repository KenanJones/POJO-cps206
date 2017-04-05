package edu.jalc.bicycle.brand;

public class BrandTest{
  public static void main(String... args) {
    System.out.println("Testing Brand . . .");
    String brandName = "a brand";
    Brand brand = new Brand(brandName);
    assert (brand.getBrandName() == brandName);
    System.out.println("Brand tests passed.");
  }
}
