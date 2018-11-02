import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ContainerFrame  extends JFrame {

    private JTextField codeField;
    private JTextField destinationField;
    private JTextField weightField;
    private JTextField powerField;
    private JButton createBulkButton;
    private JButton createRefrisgeratorButton;

    private JList shipList;
    private JPanel containerPanel;

    private JPanel centralPanel;

    private ArrayList<Ship> ships;




    public ContainerFrame(ArrayList<Ship> someShips){

        ships = someShips;

        codeField = new JTextField("Code");
        destinationField = new JTextField("Destination");
        weightField = new JTextField("weight");
        powerField = new JTextField("power");

        createBulkButton = new JButton("Create Bulk");
        createRefrisgeratorButton = new JButton("Create Refridgerator");

        shipList = new JList();
        containerPanel = new JPanel();
        centralPanel = new JPanel();

        //diaxiristis diataksis
        GridLayout grid = new GridLayout(3,2);
        //sysxetisi me ton ypodexoea (sentoni)
        containerPanel.setLayout(grid);
        //paw sto container kai prosuetw ayta p thelw na exei
        containerPanel.add(codeField);
        containerPanel.add(destinationField);
        containerPanel.add(weightField);
        containerPanel.add(powerField);
        containerPanel.add(createBulkButton);
        containerPanel.add(createRefrisgeratorButton);

        //ftiaxnw diaforetiko diaxeiristh diataksis
        BorderLayout border = new BorderLayout();
        centralPanel.setLayout(border);
        centralPanel.add(shipList, BorderLayout.NORTH);
        centralPanel.add(containerPanel, BorderLayout.CENTER);

        DefaultListModel model = new DefaultListModel();

        for(Ship ship : ships)
            model.addElement(ship.getName());


        shipList.setModel(model);

        setContentPane(centralPanel);

        ButtonListener listener = new ButtonListener();
        createBulkButton.addActionListener(listener);
        createRefrisgeratorButton.addActionListener(listener);



        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Container Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String code = codeField.getText();
            String destination = destinationField.getText();

            String selectedShipName = (String) shipList.getSelectedValue();

            Ship selectedShip = null;
            for (Ship ship : ships)
                if (ship.getName().equals(selectedShipName))
                    selectedShip = ship;

            if (e.getSource()== createBulkButton ){

                String weightText = weightField.getText();
                int weight = Integer.parseInt(weightText);
                Bulk newContainer = new Bulk(code,destination,weight);
                selectedShip.addContainer(newContainer);

            }
            else {
                String powerText = powerField.getText();
                double power = Double.parseDouble(powerText);

                Refridgerator newContainer = new Refridgerator(code, destination, power);
                selectedShip.addContainer(newContainer);

            }

            System.out.println("Selected Ship charge : " + selectedShip.getTotalCharge());

        }
    }
}
