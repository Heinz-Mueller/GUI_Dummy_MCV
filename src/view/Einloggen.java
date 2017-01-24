package view;

import controller.*;
import model.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

/**
 * Created by E.E on 09.01.2017.
 */
public class Einloggen implements IObserverInterface
{
    private iControllerInterface controller;
    private iModelInterface m_model;

    JFrame m_viewFrame;
    JMenuBar m_menuBar;
    JTextField m_redTextField;
    JPasswordField m_greenTextField;
    JButton m_setButton;
    JLabel m_errorLabel;

    public Einloggen (iModelInterface model)
    {
        erstellen();
        m_model = model;
        model.registerObserver(this);
        controller = new einloggenController(model);
    }

    public void erstellen()
    {
        m_viewFrame = new JFrame("Bitte Daten eingeben");
        m_viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        m_menuBar = new JMenuBar();
        m_viewFrame.setJMenuBar(m_menuBar);

        JPanel northPanel = new JPanel(new BorderLayout());
        m_viewFrame.getContentPane().add(northPanel,BorderLayout.NORTH);

        Box b1 = Box.createVerticalBox();
        Box b2 = Box.createVerticalBox();

        b1.add(new Label("htw", Label.CENTER));
        b2.add(new Label("Anzeige-Tafel",Label.CENTER));

        b1.add(new Label("Benutzer: ", Label.RIGHT));
        m_redTextField = new JTextField();
        m_redTextField.setHorizontalAlignment(JTextField.CENTER);
        b2.add(m_redTextField);

        b1.add(new Label("Password: ", Label.RIGHT));
        m_greenTextField = new JPasswordField();
        m_greenTextField.setHorizontalAlignment(JTextField.CENTER);
        b2.add(m_greenTextField);

        northPanel.add(b1,BorderLayout.WEST);
        northPanel.add(b2,BorderLayout.CENTER);
        m_errorLabel = new JLabel("",JLabel.CENTER);
        northPanel.add(m_errorLabel, BorderLayout.SOUTH);

        m_setButton = new JButton ("Einloggen");
        m_setButton.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                String user = m_redTextField.getText();
                System.out.println(user);
                controller.setBenutzer(user);
            }
        });

        JPanel buttonPanel = new JPanel();
        m_viewFrame.getContentPane().add(buttonPanel,BorderLayout.SOUTH);
        buttonPanel.add(m_setButton);

        // Position setzen
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        m_viewFrame.setLocation((d.width - m_viewFrame.getSize().width) / 2,
                (d.height - m_viewFrame.getSize().height) / 2);


        m_viewFrame.setSize(400, 150);

        // JFrame anzeigen
        m_viewFrame.setVisible(true);
    }

    @Override
    public void update()
    {

    }
}
