import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        
        Color[][] image = Runigram.read(args[0]);
        Color[][] greyImage = Runigram.grayScaled(image);
        int steps = Integer.parseInt(args[1]);
        Runigram.morph(image, greyImage, steps);
      }
    }
    
