import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChargeCalculator extends JFrame {

    private JButton calculateChangeChargeButton;
    private JPanel panel;
    private Ship ship;





    public ChargeCalculator(Ship aShip){

        ship = aShip;

        panel = new JPanel();
        calculateChangeChargeButton = new JButton("Calculate Charge");
        panel.add(calculateChangeChargeButton);
        this.setContentPane(panel);

        //dhmiouria
        ButtonListener listener = new ButtonListener();
        calculateChangeChargeButton.addActionListener(listener);

        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Charge Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //dhmiourgia inner class me interface to action listener (Action event)
    class ButtonListener implements ActionListener{


        // override thn synartisi ths klasis actionlistener (mono koumpia)
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Total Charge: " + ship.getTotalCharge());

        }
    }
}
