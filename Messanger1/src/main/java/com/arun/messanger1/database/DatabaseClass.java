/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arun.messanger1.database;

import com.arun.messanger1.model.Message;
import com.arun.messanger1.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arun9
 */
public class DatabaseClass {
    
    public static Map<Long, Message> messages = new HashMap<>();
   public static Map<Long, Profile> profiles = new HashMap<>();
   
   public static Map<Long, Message> getMessages(){
       return messages;

   }
    public static Map<Long, Profile> getProfiles(){
       return profiles;

   }
   

   

}
