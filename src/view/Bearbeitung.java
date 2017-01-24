package view;

import model.IObserverInterface;
import model.iModelInterface;

import javax.swing.*;


/**
 * Created by Amel on 24.01.2017.
 */
public class Bearbeitung implements IObserverInterface {

    private iModelInterface m_model;

    private JComboBox comboBox1;
    private JButton ändernButton;
    private JButton löschenButton;
    private JButton abbrechenButton;
    private JPanel bearbeitungPanel;
    private JTextArea nachrichtenArea;


    public Bearbeitung(iModelInterface model) {
        erstellen();
        m_model = model;
        model.registerObserver(this);
    }

    public void erstellen()
    {
        JFrame frame = new JFrame("Bearbeitung");
        frame.setContentPane(bearbeitungPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 0);
        frame.pack();
        frame.setSize(700, 500);
        frame.setVisible(true);
    }

    @Override
    public void update() {

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}