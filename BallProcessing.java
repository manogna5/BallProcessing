import processing.core.PApplet;
public class BallProcessing extends PApplet {
    public static final int WIDTH=648;
    public static final int HEIGHT=480;
    public static final int DIAMETER=10;
    int x=0,y=0,z=0,a=0;

    public static void main(String[] args){
        PApplet.main("BallProcessing",args);

    }
    public void settings()
    {
        super.settings();
        size(WIDTH,HEIGHT);
    }
    public void setup()
    {


    }
    public void draw()
    {
       //paintWhite();
        ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);

        x++;
        ellipse(y,2*HEIGHT/5,DIAMETER,DIAMETER);
        y=y+2;
        ellipse(z,3*HEIGHT/5,DIAMETER,DIAMETER);
        z=z+3;
        ellipse(a,4*HEIGHT/5,DIAMETER,DIAMETER);
        a=a+4;

    }
    private void paintWhite()
    {
        background(255);
    }
}
