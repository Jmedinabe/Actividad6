/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.friendmanagementgui;
import java.util.List;
/**
 *
 * @author Juan
 */
public class DisplayFriends {
    public void displayFriends(List<Friend> friends) {
        if (friends.isEmpty()) {
            System.out.println("No friends to display.");
        } else {
            for (Friend friend : friends) {
                System.out.println(friend);
            }
        }
    }
}
