/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.ArrayList;
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
import tools.AdsTools;

/**
 *
 * @author RENAUD
 */
@ServerEndpoint("/pub")
public class WSPub {
    
    //private static Set<Session> sessions = Collections.synchronizedSet(new HashSet<>());
    Session session;

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        //AdsTools.adsLoop(session);
    }

    @OnClose
    public void onClose(Session session) {
        //sessions.remove(session);
    }

    @OnError
    public void onError(Throwable error) {
    }

    @OnMessage
    public String onMessage(String message) {
        return null;
    }

}
