package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(Color.orange);
		StdDraw.ellipse(0.35, 0.6, 0.1, 0.05);
		StdDraw.ellipse(0.65, 0.4, 0.1, 0.05);
		StdDraw.ellipse(0.35, 0.4, 0.1, 0.05);
		StdDraw.ellipse(0.65, 0.6, 0.1, 0.05);
		StdDraw.filledEllipse(0.35, 0.6, 0.1, 0.05);
		StdDraw.filledEllipse(0.65, 0.4, 0.1, 0.05);
		StdDraw.filledEllipse(0.35, 0.4, 0.1, 0.05);
		StdDraw.filledEllipse(0.65, 0.6, 0.1, 0.05);
	}
}