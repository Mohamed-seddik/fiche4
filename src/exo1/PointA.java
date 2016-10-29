package exo1;

public class PointA extends Point
{

    public PointA(double x , double y)
    {
        super(x,y);
    }

    public void affichercoord()
    {
        System.out.println("("+getX()+","+getY()+")");

    }
}
