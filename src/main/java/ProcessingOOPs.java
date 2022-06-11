import processing.core.PApplet;


public class ProcessingOOPs extends PApplet {

    private class Ball{
        private int position;
        private int speed;
        private int spaceFromTop;
        private int diameter;

        private Ball(int diameter,int spaceFromTop,int speed)
        {
            this.diameter=diameter;
            this.spaceFromTop=spaceFromTop;
            this.position=0;
            this.speed=speed;
        }

        private void createMotion()
        {
            ellipse(this.position,this.spaceFromTop,this.diameter,this.diameter);
            this.position+=this.speed;
        }
    }

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int gap = HEIGHT/5;

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    public static void main(String[] args)
    {
        PApplet.main("ProcessingOOPs",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        super.setup();
        this.ball1 = new Ball(10,gap,1);
        this.ball2 = new Ball(10,2*gap,2);
        this.ball3 = new Ball(10,3*gap,3);
        this.ball4 = new Ball(10,4*gap,4);
    }

    @Override
    public void draw() {
        this.ball1.createMotion();
        this.ball2.createMotion();
        this.ball3.createMotion();
        this.ball4.createMotion();
    }
}
