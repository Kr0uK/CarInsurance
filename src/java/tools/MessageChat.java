/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Arrays;

/**
 *
 * @author RENAUD
 */
public class MessageChat {
    public static String lengthMessage (String message){
        if (message.length() > 30){
            String[] tempMessage = message.split(" ");
            for (String mot : tempMessage) {
                if(mot.length() > 30){
                    String[] tempMot = mot.split("");
                    int sizeTempMot = mot.length();
                    tempMot[25] = "-";
                    System.out.println(Arrays.toString(tempMot));
                }
            }
        }
        return message;
    }
}
