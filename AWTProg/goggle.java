import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame implements ItemListener 
{

    JLabel lbl1 = new JLabel("SERVICES");
    JLabel price1 = new JLabel("100.00");
    JLabel price2 = new JLabel("200.00");
    JLabel price3 = new JLabel("300.00");

    JCheckBox haircut = new JCheckBox("Hair Cut");
    JCheckBox fullcolor = new JCheckBox("Full Color");
    JCheckBox hairrebond = new JCheckBox("Hair Rebond");

    JPanel first = new JPanel();
    JPanel second = new JPanel();
    JPanel third = new JPanel();
    double price, total;

    public Frame()
	{

        FlowLayout flow = (new FlowLayout(FlowLayout.LEFT, 30, 30));
        add(lbl1);
        first.add(hairrebond);
        first.add(price1);
        second.add(haircut);
        second.add(price2);
        third.add(fullcolor);
        third.add(price3);

        add(first);
        add(second);
        add(third);

        setLayout(flow);
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        haircut.addItemListener(this);
        fullcolor.addItemListener(this);
        hairrebond.addItemListener(this);
    }

   // @Override
    public void itemStateChanged(ItemEvent e) {
        int sum = 0;
        if (hairrebond.isSelected() == true) {
            sum += 100;

        }

        if (fullcolor.isSelected() == true) {
            sum += 300;
        }
        if (haircut.isSelected() == true) {
            sum += 200;
        }

        total = sum;
        System.out.println(total);

    }

	 public static void main(String args[])
	{

        Frame one = new Frame();

    }
}
   


