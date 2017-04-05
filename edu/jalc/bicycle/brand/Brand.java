package edu.jalc.bicycle.brand;

public class Brand{

  private final String brandName;

  public Brand(String brandName){
    this.brandName = brandName;
  }
  public String toString(){return this.brandName;}
  public String getBrandName(){return this.brandName;}
}
