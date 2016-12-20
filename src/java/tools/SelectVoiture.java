/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RENAUD
 */
public class SelectVoiture {
    public static void selectVoiture(String resultat, HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(resultat.equals("constructeur")){
            //TODO une requete qui contient les constructeurs
            HashMap constructeurs = new HashMap();
            constructeurs.put(1, "Renault");//éphémère 
            constructeurs.put(4, "Peugeot");//éphémère
            constructeurs.put(6, "Nissan");//éphémère
            constructeurs.put(10, "Opel");//éphémère
            
            String json = new Gson().toJson(constructeurs);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
            
        } else if (resultat.equals("modele")){
            //TODO une requete avec resultat qui contient le numéro du constructeur a la place du if 
            //EX : select * from VOITURE where constructeurID = idConstructeur
            String idConstructeur = request.getParameter("modele");
            HashMap modeles = new HashMap();
            
            switch (idConstructeur) {//éphémère
                case "1":
                    modeles.put(1, "Clio 1");//éphémère
                    modeles.put(2 ,"Clio 2");//éphémère
                    modeles.put(3, "Alaskan");//éphémère
                    modeles.put(5, "Kangoo");//éphémère
                    modeles.put(10, "Megane");//éphémère
                    modeles.put(11 ,"Twingo");//éphémère
                    modeles.put(12, "Alpine");//éphémère
                    break;
                case "4":
                    modeles.put(1, "206");//éphémère
                    modeles.put(2, "207");//éphémère
                    break;
                case "6":
                    modeles.put(1, "Micra");//éphémère
                    modeles.put(2, "Leaf");//éphémère
                    break;
                case "10":
                    modeles.put(1, "GT");//éphémère
                    modeles.put(2, "Astra");//éphémère
            }
            
            String json = new Gson().toJson(modeles);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
            
        }
    }
}
