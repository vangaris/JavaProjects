import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChargeCalculator extends JFrame {

    private JButton calculateButton;
    private JPanel panel;
    private Ship ship;

    public ChargeCalculator(Ship aShip) {
        ship = aShip;

        calculateButton = new JButton("Calculate Charge");
        panel = new JPanel();
        panel.add(calculateButton);
        this.setContentPane(panel);

        ButtonListener listener = new ButtonListener();
        calculateButton.addActionListener(listener);



        this.setVisible(true);
        this.setTitle("Calculator");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Total Charge: " + ship.getTotalCharge());
            }
        }
}
