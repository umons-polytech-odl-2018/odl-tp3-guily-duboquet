package be.ac.umons.odl;

import java.awt.*;

public class Ellipsis implements Drawable {

	private Point upLeft;
	private int xAxisLength;
	private int yAxisLength;

	public Ellipsis(Point start, Point end) {
		this.yAxisLength=Math.abs(start.getY()-end.getY());
		this.xAxisLength=Math.abs(start.getX()-end.getX());
		this.upLeft=new Point(Math.min(start.getX(),end.getX()),Math.min(start.getY(),end.getY()));
	}

	public double perimeter(){
		return 2*Math.PI*Math.sqrt((Math.pow(xAxisLength,2)+Math.pow(yAxisLength,2))/2);
	}

	public double area(){
		return Math.PI*xAxisLength*yAxisLength;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(upLeft.getX(), upLeft.getY(), xAxisLength, yAxisLength);
	}
}
