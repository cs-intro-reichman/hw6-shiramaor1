import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int steps = Integer.parseInt(args[1]);
        Color[][] image = Runigram.read(fileName);
        Color[][] greyImage = Runigram.grayScaled(image);
        Runigram.morph(image, greyImage, steps);
      }
    }
    
