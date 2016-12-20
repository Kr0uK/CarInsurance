/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.Session;
import servlets.WSPub;

/**
 *
 * @author RENAUD
 */
public class AdsTools {

    private static String[] pubs
            = {"Achetez maintenant une voiture et recevez la deuxieme pour le meme prix",
                "Adoptez un chaton!",
                "Nous vous conseillons Car Insurance !",
                "Rencontre les assureurs de voitures chauds de ta région !",
                "Ce conducteur a trouvé l'astuce pour payer moins de frais d'assurance ! Les assureurs le détestent !",
                "Vous avez une petite voiture ? Agrandissez votre cylindrée grâce à nos services !"};

    public static void adsLoop(Session session) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    for (String pub : pubs) {
                        session.getBasicRemote().sendText(pub);
                        Thread.sleep(3000);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(WSPub.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WSPub.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }
}
