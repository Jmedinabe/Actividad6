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
public class DeleteFriend {
    public void deleteFriend(List<Friend> friends, String name) {
        friends.removeIf(friend -> friend.getName().equalsIgnoreCase(name));
        System.out.println("Friend deleted successfully!");
    }
}
