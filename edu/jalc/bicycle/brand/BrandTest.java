package edu.jalc.bicycle.brand;

public class BrandTest{
  public static void main(String... args) {
    String brandName = "a brand";
    Brand brand = new Brand(brandName);
    assert (brand.getBrandName() == brandName);
  }
}
