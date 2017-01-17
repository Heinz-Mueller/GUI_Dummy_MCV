package view;

import model.IObserverInterface;
import model.iModelInterface;

import javax.swing.*;

/**
 * Created by E.E on 10.01.2017.
 */
public class Tafel implements IObserverInterface
{
    private iModelInterface m_model;

    private JTextArea nachrichtenArea;
    private JPanel tafelPanel;
    private JButton sendenButton;
    private JTextField nachrichtTexteingabe;
    private JLabel User;
    private JLabel aktuellerUser;

    //JFrame frame = new JFrame("Tafel");

    public Tafel(iModelInterface model)
    {
       erstellen();
       m_model = model;
       model.registerObserver (this);
    }


    public void erstellen()
    {
        JFrame frame = new JFrame("Tafel");
        frame.setContentPane(tafelPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700, 500);
        frame.setVisible(true);
    }

    @Override
    public void update()
    {
        String user = m_model.getUser();
        System.out.println(user);
        aktuellerUser.setText(user);
    }
}
