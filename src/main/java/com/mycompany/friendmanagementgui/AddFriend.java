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
public class AddFriend {
    public void addFriend(List<Friend> friends, Friend friend) {
        friends.add(friend);
        System.out.println("Friend added successfully!");
}
}