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
   public String toString(){
     if(red > green && red > blue) return "Red";
     else if(green > red && green > blue) return "Green";
     else if(blue > red && blue > green) return "Blue";
     else if(blue == red && red == green && green == 255) return "Black";
     else if(blue == red && red == green && green == 0) return "White";
     else return "Color: " + red + " " + green + " " + blue;
   }
}
