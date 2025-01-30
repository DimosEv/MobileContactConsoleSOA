package gr.aueb.cf.pointapp.model;

import java.awt.*;

/**
 *  Defines a {@link  Point3D} that represents a 3D point.
 *  it provides a public API that icludes {@link  #getDistanceFromOrigin()}
 *  for getting the distance from the point to the origin.
 *
 * @author  a*ana
 * @version 0.1
 * @since 0.1
 */

public class Point3D {
    private double X;
    private double Y;
    private double Z;

    public Point3D(){

    }

    public Point3D(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    /**
     *  Gets the distance of a 3d point from the origin.
     * @return the Euclidian distance of the point to the origin (0,0,0)
     */

    public double getDistanceFromOrigin(){
        double x;

        return Math.sqrt(Math.pow(X,2) + Math.pow(Y,2) + Math.pow(Z,2));
    }
}
