package exo1;



public class Main
{

    public static void main(String[] args)
    {
	    Point X = new Point(5.0,2.0);
        PointA Y = new PointA(-1.0,2.0);
        PointNom Z = new PointNom(2,3,'f');

        System.out.println("cordonner point 1 :("+X.getY()+","+X.getY()+")");
        System.out.print("cordonner point 2 :");Y.affichercoord();
        Z.affichercoord();

        //deplacer les point

        X.deplace(2,2);
        Y.deplace(2,2);
        Z.deplacepointnom(2,2);
        System.out.println("nouvelle cordonneé aprés déplacement\n");
        System.out.println("cordonner point 1 :("+X.getY()+","+X.getY()+")");
        System.out.print("cordonner point 2 :");Y.affichercoord();
        Z.affichercoord();


    }
}
