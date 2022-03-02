import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	private int frameLength = 800;
	private int frameHeight = 600;
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
		//each method call will draw a circle! 
		g.setColor(Color.red);
		g.drawOval(x, y, width, width);
		
		//then the method should call another method to draw a
		//different circle
		
		if (width >= 10) {
			concentricCircles(g, width - 10, x + 5, y + 5);
		}
	}	
	
	public void squares(Graphics g, int width, int x, int y, Color c) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		g.setColor(c);
		g.fillRect(x, y, width, width);
		
		if (width > 10) {
			squares(g, width / 3, x - 2 * width / 3, y - 2 * width / 3, Color.magenta);
			squares(g, width / 3, x + 1 * width / 3, y - 2 * width / 3, Color.red);
			squares(g, width / 3, x + 4 * width / 3, y - 2 * width / 3, Color.white);
			squares(g, width / 3, x - 2 * width / 3, y + 1 * width / 3, Color.green);
			squares(g, width / 3, x + 4 * width / 3, y + 1 * width / 3, Color.blue);
			squares(g, width / 3, x - 2 * width / 3, y + 4 * width / 3, Color.pink);
			squares(g, width / 3, x + 1 * width / 3, y + 4 * width / 3, Color.yellow);
			squares(g, width / 3, x + 4 * width / 3, y + 4 * width / 3, Color.cyan);
		}
	}
	
	public void clover(Graphics g, int width, int x, int y, int val) { //What additional variables will you need to draw the shape?
		g.setColor(Color.white);
		g.drawOval(x, y, width, width);
		
		//then the method should call another method to draw a
		//different circle

		if (width >= 10 && val == 1) {
			clover(g, width - 10, x, y, 1);
		}
		if (width >= 10 && val == 2) {
			clover(g, width - 10, x + 10, y, 2);
		}
		if (width >= 10 && val == 3) {
			clover(g, width - 10, x, y + 10, 3);
		}
		if (width >= 10 && val == 4) {
			clover(g, width - 10, x + 10, y + 10, 4);
		}
	}
	
	public void lineFractal(Graphics g, int length, int x1, int y1, int x2, int y2) { //What additional variables will you need to draw the shape?
		g.setColor(Color.cyan);
		g.drawLine(x1, y1, x2, y2);
		
		//then the method should call another method to draw a
		//different circle
		
		if (length > 10) {
			lineFractal(g, length / 3, x2, y2, x2 + length / 6, y2 + length / 3);
			lineFractal(g, length / 3, x2, y2, x2 - length / 6, y2 + length / 3);
			lineFractal(g, length / 3, x2, y2, x2 - length / 3, y2);
			lineFractal(g, length / 3, x2, y2, x2 + length / 6, y2 - length / 3);
			lineFractal(g, length / 3, x2, y2, x2 - length / 6, y2 - length / 3);
			lineFractal(g, length / 3, x2, y2, x2 + length / 3, y2);
		}
		
	}

	public void advancedTriforce(Graphics g, int length, int x1, int y1, int x2, int y2) { //What additional variables will you need to draw the shape?
		g.setColor(Color.cyan);
		
		
		//then the method should call another method to draw a
		//different circle
		
		if (length > 10) {
			
		}
		
	}
	
	public void fourTree(Graphics g, int length, int x1, int y1, int x2, int y2) { //What additional variables will you need to draw the shape?
		g.setColor(Color.blue);
		g.drawLine(x1, y1, x2, y2);
		
		//then the method should call another method to draw a
		//different circle
		
		if (length > 10) {
			fourTree(g, length / 2, x2, y2, x2 - 75, y2 - (length * 5 / 14));
			fourTree(g, length / 2, x2, y2, x2 - 25, y2 - (length * 98 / 200));
			fourTree(g, length / 2, x2, y2, x2 + 25, y2 - (length * 98 / 200));
			fourTree(g, length / 2, x2, y2, x2 + 75, y2 - (length * 5 / 14));
		}
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		
		
		//call circles
		//concentricCircles(g, 500, 0, 0);
		//squares(g, 150, (frameLength / 2) - (150 / 2), (frameHeight / 2) - (150 / 2), Color.orange);
		//clover(g, 250, (frameLength / 2), (frameHeight / 2), 1);
		//clover(g, 250, (frameLength / 2) - 250, (frameHeight / 2), 2);
		//clover(g, 250, (frameLength / 2), (frameHeight / 2) - 250, 3);
		//clover(g, 250, (frameLength / 2) - 250, (frameHeight / 2) - 250, 4);
		//lineFractal(g, 150, (frameLength / 2), (frameHeight / 2), (frameLength / 2) + 150 / 2, (frameHeight / 2) + 150);
		//lineFractal(g, 150, (frameLength / 2), (frameHeight / 2), (frameLength / 2) - 150 / 2, (frameHeight / 2) + 150);
		//lineFractal(g, 150, (frameLength / 2), (frameHeight / 2), (frameLength / 2) - 150, (frameHeight / 2));
		//lineFractal(g, 150, (frameLength / 2), (frameHeight / 2), (frameLength / 2) - 150 / 2, (frameHeight / 2) - 150);
		//lineFractal(g, 150, (frameLength / 2), (frameHeight / 2), (frameLength / 2) + 150 / 2, (frameHeight / 2) - 150);
		//lineFractal(g, 150, (frameLength / 2), (frameHeight / 2), (frameLength / 2) + 150, (frameHeight / 2));
		fourTree(g, 150, (frameLength / 2), (frameHeight / 2) + 200, (frameLength / 2), (frameHeight / 2) + 50);
	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(frameLength,frameHeight);
		f.add(this);
		f.setVisible(true);
		
	}
	Timer t = new Timer(16, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete