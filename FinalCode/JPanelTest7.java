import java.awt.Toolkit;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

//MOST CURRENT WORKING ONE
//
//Main Class
//Creates Panel and assigns objects.
public class JPanelTest7 extends JFrame{
   
   static JFrame f = new JPanelTest7();
   Interface4 screen  = new Interface4();
   int mouseX;
   int mouseY;
   
   //creates fullscreen panel
   public JPanelTest7() {
      add(screen);
      setUndecorated(true);
      setSize(Toolkit.getDefaultToolkit().getScreenSize());
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setVisible(true);
      setTitle("3D Object Viewer");
      
      // **inputs**
      //   
      // ***OUTDATED*** DO NOT USE
      /*
      MouseInput2 mouse = new MouseInput2();
      getContentPane().addMouseListener(mouse);
      getContentPane().addMouseMotionListener(mouse);
      mouseX = mouse.mx;
      mouseY = mouse.my;
      */
      
      /*
      KeyboardInput2 kboard = new KeyboardInput2();
      addKeyListener(kboard);
      */
   }
   
   public static void main(String[] args){
   }
} 