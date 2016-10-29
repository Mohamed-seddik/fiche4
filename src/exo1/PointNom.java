package exo1;


public class PointNom extends Point
{
    private char name;
    private int x;
    private int y;

    public PointNom(int x,int y,char name)
    {
        this.y=y;
        this.x=x;
        this.name=name;
    }

    public int getx()
    {
        return this.x;
    }

    public int gety()
    {
        return this.y;
    }

    public char getName()
    {
        return this.name;
    }

    public void deplacepointnom(int dx,int dy)
    {
        x+=dx;
        y+=dy;
    }

    public void affichercoord()
    {
        System.out.println("le point : "+getName()+" ces cordonner sont : ("+getx()+","+gety()+")");

    }

}
