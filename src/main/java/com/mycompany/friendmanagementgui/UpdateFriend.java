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
public class UpdateFriend {
    public void updateFriend(List<Friend> friends, String name, String newPhone) {
        for (Friend friend : friends) {
            if (friend.getName().equalsIgnoreCase(name)) {
                friend.setPhone(newPhone);
                System.out.println("Friend updated successfully!");
                return;
            }
        }
        System.out.println("Friend not found.");
    }
}
