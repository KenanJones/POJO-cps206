package bicycle;

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
   
   public void setRed(byte red){
      this.red = red;
   }
   
   public void setGreen(byte green){
      this.green = green;
   }
   
   public void setBlue(byte blue){
      this.blue = blue;
   }
}
