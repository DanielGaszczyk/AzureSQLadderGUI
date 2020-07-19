package com.sqldbsamples;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
    private JTextField nameField; //pole na nazwę
    private JTextField cityField; //pole na adres
    private JTextField streetField;
    private JTextField numField;
    private JTextField postalCodeField; //pole na punkty bezpieczenstwa
    private JTextField typeField;
    private JTextField securityRateField;
    private JTextField staffWearingMasksField;
    private JTextField sanitizerAVField;
    private JTextField distKeptField;
    private JTextField otherField;
    private JTextField isOpenField;
    private JTextField latitudeField;
    private JTextField longitudeField;
    private JButton addToDatabaseButton; //przycisk dodawania do bazy
    private LoginListener listener; //słuchacz przycisku

    public String getName() {
        return nameField.getText();
    }
    public String getCity() {
        return cityField.getText();
    }
    public String getStreet() {
        return streetField.getText();
    }
    public String getNumber() {
        return numField.getText();
    }
    public String getPostalCode() {
        return postalCodeField.getText();
    }
    public String getType() {
        return typeField.getText();
    }
    public String getSecurityRate() {
        return securityRateField.getText();
    }
    public String getStaffWearingMasks() {
        return staffWearingMasksField.getText();
    }
    public String getSanitizerAV() {
        return sanitizerAVField.getText();
    }
    public String getDistKept() {
        return distKeptField.getText();
    }
    public String getOther() {
        return otherField.getText();
    }
    public String getIsOpen() {
        return isOpenField.getText();
    }
    public String getLatitude() {
        return latitudeField.getText();
    }
    public String getLongitude() {
        return longitudeField.getText();
    }

    public LoginPanel(LoginListener listener) {
        super();
        // ustawiamy layout
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.CENTER;
        gridBag.setConstraints(this, constraints);
        setLayout(gridBag);
        // tworzymy komponenty logowania
        this.listener = listener;
        this.listener.setPanel(this);
        createComponents();
    }

    /**
     * Metoda, która tworzy etykiety i pola do wprowadzania danych.
     */
    private void createComponents() {
        JLabel name = new JLabel("Name: ");
        JLabel city = new JLabel("City: ");
        JLabel street = new JLabel("Street: ");
        JLabel number = new JLabel("Number: ");
        JLabel postalCode = new JLabel("Postal Code: ");
        JLabel type = new JLabel("Type: ");
        JLabel securityRate = new JLabel("Security Rate: ");
        JLabel staffWearingMasks = new JLabel("Staff Wearing Masks: ");
        JLabel sanitizerAV = new JLabel("Sanitizer AV: ");
        JLabel distKept = new JLabel("Dist Kept: ");
        JLabel other = new JLabel("Other: ");
        JLabel isOpen = new JLabel("Is Open(True/false): ");
        JLabel latitude = new JLabel("Latitude: ");
        JLabel longitude = new JLabel("Longitude: ");
        nameField = new JTextField();
        cityField = new JTextField();
        streetField = new JTextField();
        numField = new JTextField();
        postalCodeField = new JTextField();
        typeField = new JTextField();
        securityRateField = new JTextField();
        staffWearingMasksField = new JTextField();
        sanitizerAVField = new JTextField();
        distKeptField = new JTextField();
        otherField = new JTextField();
        isOpenField = new JTextField();
        latitudeField = new JTextField();
        longitudeField = new JTextField();



        //pomocniczy panel do wprowadzania danych
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(14, 2));
        inputPanel.add(name);
        inputPanel.add(nameField);
        inputPanel.add(city);
        inputPanel.add(cityField);
        inputPanel.add(street);
        inputPanel.add(streetField);
        inputPanel.add(number);
        inputPanel.add(numField);
        inputPanel.add(postalCode);
        inputPanel.add(postalCodeField);
        inputPanel.add(type);
        inputPanel.add(typeField);
        inputPanel.add(securityRate);
        inputPanel.add(securityRateField);
        inputPanel.add(staffWearingMasks);
        inputPanel.add(staffWearingMasksField);
        inputPanel.add(sanitizerAV);
        inputPanel.add(sanitizerAVField);
        inputPanel.add(distKept);
        inputPanel.add(distKeptField);
        inputPanel.add(other);
        inputPanel.add(otherField);
        inputPanel.add(isOpen);
        inputPanel.add(isOpenField);
        inputPanel.add(latitude);
        inputPanel.add(latitudeField);
        inputPanel.add(longitude);
        inputPanel.add(longitudeField);

        //tworzymy przycisk logowania
        addToDatabaseButton = new JButton("Add");
        addToDatabaseButton.addActionListener(listener);

        //pomocniczy panel do wyśrodkowania elementów
        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(inputPanel, BorderLayout.CENTER);
        parentPanel.add(addToDatabaseButton, BorderLayout.SOUTH);

        // dodajemy do głównego panelu
        this.add(parentPanel);
    }
}