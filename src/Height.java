
public class Height {

   private Memory memory = new Memory();

   public double mtokm (double height) {
       height = height / 1000 ;
       memory.addToMemory(height);
       System.out.println("The height from m in km is " + height);
       return height;
   }


    public double kmtom (double height) {
        height = height*1000;
        memory.addToMemory(height);
        System.out.println("The height from km to m is " + height);
        return height;

    }
    public double mtocm (double height) {
        height = height*100;
        memory.addToMemory(height);
        System.out.println("The height from m to cm is " + height);
        return height;

    }
    public double cmtom (double height) {
       height = height/100;
        memory.addToMemory(height);
        System.out.println("The height from cm to m is " + height);
        return height;

    }

}
