/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Duoc UC
 */
public class MainIndicadores {
    
     public static void main(String[] args) throws MalformedURLException, IOException{
         /*Scanner teclado = new Scanner(System.in);
         System.out.print("Indicador: ");
         String indicador = teclado.next();
         
         System.out.println("Obteniendo variaciones de "+indicador+"...");
         URL url = new URL("http://mindicador.cl/api/"+indicador);
                  
         InputStream entrada = url.openStream();
         JsonReader reader = Json.createReader(entrada);
         JsonObject objeto = reader.readObject();
         
         for (int i = 0; i < objeto.getJsonArray("serie").size(); i++){
             System.out.println("Valor "+ (i+1) + ": "+ objeto.getJsonArray("serie").getJsonObject(i).get("valor"));
         } */
         
         
         System.out.println("Obteniendo variaciones del Bitcoin");
         URL url = new URL("http://mindicador.cl/api/bitcoin");
                  
         InputStream entrada = url.openStream();
         JsonReader reader = Json.createReader(entrada);
         JsonObject objeto = reader.readObject();
         
         for (int i = 0; i < objeto.getJsonArray("serie").size(); i++){
             if(i == 0) {
                 System.out.println("Valor de hoy: "+objeto.getJsonArray("serie").getJsonObject(i).get("valor"));
             } else {
                 System.out.println("Valor de "+ i + " días atrás: "+ objeto.getJsonArray("serie").getJsonObject(i).get("valor"));
             }
         }

         
    }
    
}
