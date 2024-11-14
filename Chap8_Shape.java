package javaapplication41;

import java.awt.*;
import javax.swing.*;

public class JavaApplication41 extends JFrame {

    public JavaApplication41() {
        // Set up the JFrame properties
        setTitle("Rumah Pak Jabit");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        // Set color and draw the base of the house
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(100, 150, 200, 150); // Base of the house

        // Draw the roof as a triangle
        g.setColor(Color.DARK_GRAY);
        int[] xPoints = {90, 200, 310}; // X-coordinates for the roof
        int[] yPoints = {150, 70, 150}; // Y-coordinates for the roof
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the door
        g.setColor(new Color(102,51,0));
        g.fillRect(180, 230, 40, 70);

        // Draw windows
        g.setColor(Color.CYAN);
        g.fillRect(120, 170, 40, 40); // Left window
        g.fillRect(240, 170, 40, 40); // Right window

        // Add window panes
        g.setColor(Color.BLACK);
        g.drawLine(140, 170, 140, 210); // Left window vertical pane
        g.drawLine(120, 190, 160, 190); // Left window horizontal pane
        g.drawLine(260, 170, 260, 210); // Right window vertical pane
        g.drawLine(240, 190, 280, 190); // Right window horizontal pane

        // Add details to the door
        g.setColor(Color.BLACK);
        g.fillOval(215, 265, 5, 5); // Door knob
    }

    public static void main(String[] args) {
        // Create the frame and make it visible
        JavaApplication41 frame = new JavaApplication41();
        frame.setVisible(true);
    }
}
