import javax.swing.*;

/**
 * Created by nikola3in1 on 23.12.16..
 */
public class Button {
    public int x;
    public int y;
    GUI gui = new GUI();

    public Button(int x, int y) {
        this.x = x;
        this.y =y;
        setLocation();
    }

    public void setLocation() {
        JButton button = new JButton();

        button.setBounds(x,y,50,20);
        System.out.println(button.getBounds());
        gui.frame.add(button);
    }


}