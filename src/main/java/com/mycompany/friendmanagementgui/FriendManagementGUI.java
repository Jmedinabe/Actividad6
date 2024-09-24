/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.friendmanagementgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Juan
 */
public class FriendManagementGUI {
    private List<Friend> friends = new ArrayList<>();
    private AddFriend addFriend = new AddFriend();
    private DisplayFriends displayFriends = new DisplayFriends();
    private UpdateFriend updateFriend = new UpdateFriend();
    private DeleteFriend deleteFriend = new DeleteFriend();

    public static void main(String[] args) {
        new FriendManagementGUI().createGUI();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Friend Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        // Campos de texto
        JTextField nameField = new JTextField();
        JTextField phoneField = new JTextField();

        // Botones
        JButton addButton = new JButton("Add Friend");
        JButton displayButton = new JButton("Display Friends");
        JButton updateButton = new JButton("Update Friend");
        JButton deleteButton = new JButton("Delete Friend");

        // Labels
        frame.add(new JLabel("Name:"));
        frame.add(nameField);

        frame.add(new JLabel("Phone:"));
        frame.add(phoneField);

        frame.add(addButton);
        frame.add(displayButton);
        frame.add(updateButton);
        frame.add(deleteButton);

        // Eventos de los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                addFriend.addFriend(friends, new Friend(name, phone));
                clearFields(nameField, phoneField);
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayFriends.displayFriends(friends);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                updateFriend.updateFriend(friends, name, phone);
                clearFields(nameField, phoneField);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                deleteFriend.deleteFriend(friends, name);
                clearFields(nameField, phoneField);
            }
        });

        frame.setVisible(true);
    }

    private void clearFields(JTextField nameField, JTextField phoneField) {
        nameField.setText("");
        phoneField.setText("");
    }
}