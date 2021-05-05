

public class Main {
    public static void main(String[] args) {
//            StdDraw.setPenRadius(0.05);
//            StdDraw.setPenColor(StdDraw.BLUE);
//            StdDraw.point(0.5, 0.5);
//            StdDraw.setPenColor(StdDraw.MAGENTA);
//            StdDraw.line(0.2, 0.2, 0.8, 0.2);

            //read in jpg in java

        //how to use the keyboard as controls
        //Keyboard.create();


//simply testing to see if the audio works
        StdAudio.play("thrust.wav");
        StdAudio.play("yay.wav");
        StdAudio.play("explosion.wav");

        //trying std draw thing
        //StdDraw.clear();
        StdDraw.setCanvasSize(1000,500);
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/mars_sky.jpg");
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/ship.png");
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/ship_bottom.png");
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/ship_crashed.png");
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/ship_landed.png");
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/ship_left.png");
        StdDraw.picture(0.5,0.5,"/Users/lissettesoto/IdeaProjects/MarsLander/src/ship_right.png");
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(0.5,0.1,0.02,0.01);
        //StdDraw.line(0.2, 0.2, 0.5, 0.2);


        //how to see if they landed on the rectangle is by using the same coordinate of the landing pad


    }

}


