package edu.jalc.bicycle.color;

public class Color{

   private byte red;
   private byte green;
   private byte blue;

   public Color(int red, int green, int blue){
      this.red = (byte)red;
      this.green = (byte)green;
      this.blue = (byte)blue;
   }

   public byte getRed(){
      return red;
   }

   public byte getGreen(){
      return green;
   }
   
   public byte getBlue(){
      return blue;
   }
   
   public void setRed(int red){
      this.red = (byte)red;
   }
   
   public void setGreen(int green){
      this.green = (byte)green;
   }
   
   public void setBlue(int blue){
      this.blue = (byte)blue;
   }
}
