package be.ac.umons.odl;

public class Circle extends Ellipsis{
	private Point upLeft;
	private int radius;

	public Circle (Point start, int radius, Point end) {
		super(start, new Point(start.getX() + radius, start.getY() + radius));
		this.upLeft=new Point(Math.min(start.getX(),end.getX()),Math.min(start.getY(),end.getY()));
		this.radius = Math.min(start.getX()-end.getX(),start.getY()-end.getY());
	}
}
