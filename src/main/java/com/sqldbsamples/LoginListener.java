package com.sqldbsamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class LoginListener implements ActionListener {
    //Główna ramka programu
    private final JFrame frame;
    //Panel logowania, potrzebny do pobrania loginu i hasła
    private LoginPanel loginPanel;

    public void setPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public LoginListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String name = loginPanel.getName();
        String city = loginPanel. getCity();
        String street = loginPanel.getStreet();
        String postalCode = loginPanel.getPostalCode();
        String type = loginPanel.getType();
        String securityRate = loginPanel.getSecurityRate();
        String staffWearingMasks = loginPanel.getStaffWearingMasks();
        String sanitizerAV = loginPanel.getSanitizerAV();
        String distKept = loginPanel.getDistKept();
        String other = loginPanel.getOther();
        String isOpen = loginPanel.getIsOpen();
        String latitude = loginPanel.getLatitude();
        String longitude = loginPanel.getLongitude();




        // Connect to database
        String hostName = "staysafe-server.database.windows.net"; // update me
        String dbName = "StaySafAndGoPlaces"; // update me
        String user = "staysafeadmin"; // update me
        String password = "StaySafe1"; // update me
        String url = String.format("jdbc:sqlserver://staysafe-server.database.windows.net:1433;database=StaySafAndGoPlaces;user=staysafeadmin@staysafe-server;password=StaySafe1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url);
            String schema = connection.getSchema();

            // Create and execute a SELECT SQL statement.
            String insertSql ="INSERT INTO mytable(NAME,CITY,STREET,POSTAL_CODE,TYPE,SECURITY_RAT,STAFF_WEARING_MASKS,SANITIZER_AV,DIST_KEPT,OTHER,ISOPEN,LATITUDE,LONGITUDE) VALUES ('"+name+"','"+city+"','"+street+"','"+postalCode+"','"+type+"','"+securityRate+"','"+staffWearingMasks+"','"+sanitizerAV+"','"+distKept+"','"+other+"','"+isOpen+"','"+latitude+"','"+longitude+"');"  ;


            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(insertSql))
            {

            }
            connection.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
