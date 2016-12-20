/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;

/**
 *
 * @author RENAUD
 */
@ServerEndpoint("/chat")
public class WSChat {

    private static Set<Session> sessions = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(Session session) {
        sessions.add(session);
    }

    @OnClose
    public void onClose(Session session) {
        sessions.remove(session);
    }

    @OnError
    public void onError(Throwable error) {
        System.out.println(error);
    }

    @OnMessage
    public String onMessage(String message) {
        synchronized (sessions){
            for (Session session : sessions) {
                try {
                    if(!message.isEmpty()){
                        if (message.length() > 30) {
                            String chaine = "";
                            String[] split = message.split("");
                            for(int i=0 ; i < 30 ; i++) {  
                                chaine += split[i];
                            } 
                            message = chaine; 
                        }
                        
                        /*
                        String chaine = "";
                        String[] split = message.split("");
                        for(int i=0 ; i < message.length() ; i++) {                            
                            if ((i > 0) && (split[i].equals(split[i-1]))) {
                                if (message.length() > i+1) {
                                    if (split[i].equals(split[i+1])) {
                                        if ((i == 87) && (i == 174)) {
                                            split[i] = " ";
                                        }
                                        // TODO : inserer un espace entre i et i+1
                                    }
                                }
                            }
                            chaine += split[i];
                        }
                        */                
                        session.getBasicRemote().sendText(escapeHtml4(message));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(WSChat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
}
