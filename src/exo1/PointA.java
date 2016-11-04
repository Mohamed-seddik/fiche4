package exo1;

public class PointA extends Point
{

    public PointA(double x , double y)
    {
        super(x,y);
    }

    public String affichercoord()
    {
        return "("+getX()+","+getY()+")";

    }
}
