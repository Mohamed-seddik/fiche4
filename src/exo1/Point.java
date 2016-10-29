package exo1;

public class Point
{
    private double x,y;

    public Point()
    {
        this.x=this.y=0;
    }

    public Point(double x)
    {
        this.x=this.y=x;
    }

    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }



    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public void deplace(int dx,int dy)
    {
        x+=dx;
        y+=dy;

    }
}
