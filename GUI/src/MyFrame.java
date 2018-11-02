import javax.swing.*;

public class MyFrame extends JFrame {

    private JPanel panel;
    private JTextField textField;
    private JButton button;

    public MyFrame(){

        panel = new JPanel(); // 1o bhma dimiourga ypodoxea
        textField = new JTextField(10); //2o Bhma dhmiourgia grafikon systatikon / akeraio analogo tou paltaous os parametros
        button = new JButton("Press me");//2o bhna




        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("My first Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(textField);// 3o Bhma
        panel.add(button);//3o bhma prosthiki grafikon systatikwn

        this.setContentPane(panel);// 4o bhma prosarmogi ypodoxea
    }
}
