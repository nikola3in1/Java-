import javax.swing.*;

/**
 * Created by nikola3in1 on 23.12.16..
 */
public class GUI extends JFrame{
    JFrame frame = new JFrame();

    public GUI(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Find Replace");
        frame.setLayout(null);
        frame.setBounds(0,0,800,600);

        //btn.setBounds(this.getX(),this.getY(),50,20);
        Button btn = new Button(12,12);

        frame.setVisible(true);

    }
}
