import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//Full interface
//Puts everything on screen
public class Interface4 extends JPanel implements ActionListener, KeyListener, MouseMotionListener {
   
   //miscalaneus constructors
   PolygonObject Poly1;
   Timer tm = new Timer(5, this);
   //DPoly DP = new DPoly (new int[]{1,2,3}, new int[]{4,5,6}, new int[]{6,6,6}, Color.BLACK);
      
   String temp;
   int keyX = 1, keyY;
   private int mX, mY;
   int velocity = 7;
   
   //adds the mouseInput, KeyListener, starts timer, creates polygon
   public Interface4() {
      tm.start();
      addKeyListener(this);
      addMouseMotionListener(this);
      setVisible(true);
      setFocusable(true);
      setFocusTraversalKeysEnabled(false);
      
      
      //               (1) top angle x pos| (2)width | (3) bottom angle x position
      Poly1 = new PolygonObject(new double[]{keyX,  200,   10}, 
      //                              (4) top angle y pos|   | (5) right angle y position   
                                              new double[]{10, 20, 400},
                                                Color.black);  //   | (6) bottom angle y position
                               
   }
   
   //creates test oval and polygon shape
   public void paintComponent(Graphics g) { 
      super.paintComponent(g);
      //g.fillRect(200 - x/2, 200 - x/2, 100 + x, 100 + x);
      g.fillOval(mX * -1 + 700, mY * -1 + 350, 30 + keyX, 30 + keyX);
      Poly1.drawPolygon(g);
      
   }
   
   //listens for actions and calls a repaint
   public void actionPerformed(ActionEvent e) {
      repaint();
   }
   
   //keyboard input
   public void keyPressed(KeyEvent e) {
      temp = "" + e.getKeyChar();
      if (temp.equals("w")) {
         keyX = keyX + velocity;
      }
      
      if (temp.equals("s")) {
         keyX = keyX - velocity;
      }
   }
   
   //key Released *REQUIRED TO OPERATE*
   public void keyReleased(KeyEvent e) {
      temp = null;
   }
   
   //keyTyped *REQUIRED TO OPERATE*
   public void keyTyped(KeyEvent e) {
   }
   
   //mouse movement input
   //adds mouse position to varibles mX, mY
   public void mouseMoved(MouseEvent me) {
      mX = (int) me.getPoint().getX();
      mY = (int) me.getPoint().getY();
      //System.out.println(mX + " " + mY);
      repaint();
  }
  
  //mouse drag input
  //calls back to mouse movement, nullifying it
  public void mouseDragged(MouseEvent me) {
      mouseMoved(me);
  }
}