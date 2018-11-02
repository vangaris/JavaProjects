import javax.swing.*;
import java.awt.*;

public class ContainerFrame extends JFrame {

    private JTextField codeField;
    private JTextField destinationFiled;
    private JTextField weightField;
    private JTextField powerFiled;
    private JButton createBulkButton;
    private JButton createRefridgeratorButton;

    //ftiaxnw ena antikeimeno JList
    private JList shipList;

    //dhmiourgia panel to opoio tha perilambanei grafika systatika se plegma3x2
    private JPanel containerPanel;

    //dhmiourgia kentrikou panel
    private JPanel centealPanel;




    public ContainerFrame() {

        // ftiaxnw grafika systatika
        codeField = new JTextField("Code");
        destinationFiled = new JTextField("Destination");
        weightField = new JTextField("Weight");
        powerFiled = new JTextField("Power");
        createBulkButton = new JButton("Create Bulk");
        createRefridgeratorButton = new JButton("Create Refridgerator");
        shipList = new JList();

        // tha filoksenisei ta pedia keimenou kai ta pliktra
        containerPanel = new  JPanel();

        //ftiaxnw diataksi 3 grammes 2 steiles, analamvanei ti diaxirisi allon pragmaton
        GridLayout grid = new GridLayout();
        //sysxetisi toy gri me ton ypodoxea
        containerPanel.setLayout(grid);

        containerPanel.add(codeField);
        containerPanel.add(destinationFiled);
        containerPanel.add(weightField);
        containerPanel.add(powerFiled);
        containerPanel.add(createBulkButton);
        containerPanel.add(createRefridgeratorButton);

        //dhmiourgia diaxiristi diataksis
        BorderLayout border = new BorderLayout();
        centealPanel.setLayout(border);

        centealPanel.add(shipList, BorderLayout.NORTH);
        centealPanel.add(containerPanel, BorderLayout.CENTER);

        //prosarmogi central panel pano stin othoni
        this.setContentPane(centealPanel);



        this.setVisible(true);
        this.setTitle("Container Frame");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
