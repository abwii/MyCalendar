package Vues;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.JSONObject;
import org.json.JSONArray;

public class FrmMenu extends JFrame {

    private JPanel rootPane;
    private JButton btnExporter;
    private JCheckBox boxZoneA;
    private JCheckBox boxZoneB;
    private JCheckBox boxZoneC;
    private JCheckBox boxJourFerie;
    private JCheckBox boxApi5;
    private JSpinner spnDuree;
    private JPanel pnlCalendar;
    private JPanel pnlTopics;

    public FrmMenu() throws SQLException, ClassNotFoundException {
        setTitle("Gestionnaire de Calendriers");
        setContentPane(rootPane);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 300);


        btnExporter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "tu as cliqué sur le bouton bravo !");

                // Récupération des informations et création du fichier .json

                // Requête Google Calendar API en Python

                JOptionPane.showMessageDialog(null, "owo");

            }
        });

        boxZoneA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JSONObject obj = new JSONObject(

                );

            }
        });

        boxZoneB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        boxZoneC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boxJourFerie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnExporter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new FrmMenu().setVisible(true);
    }

    // Getters

    public JButton getBtnExporter() {
        return btnExporter;
    }

    public JCheckBox getBoxApi1(Icon icon, boolean s) {
        return boxZoneA;
    }
}
