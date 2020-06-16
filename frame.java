
import javax.swing.*; 
import java.awt.Graphics; 

public class frame extends JFrame{
    private static final long serialVersionUID = 1L;


    JPanel panel = new JPanel(); 
    
    public frame()
    {
        super("MoveGuy");
        setSize(400,400); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);

        
    }

    public void paint(Graphics g){
        g.drawRect(10,10,10,10); 
    }



    public static void main(String[] args)
    {
        new frame(); 
    }


}