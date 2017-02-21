package edu.jalc.bicycle.color;

public class Color{

   private final byte red;
   private final byte green;
   private final byte blue;

   private Color(){red = green = blue = 0;}

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
}
