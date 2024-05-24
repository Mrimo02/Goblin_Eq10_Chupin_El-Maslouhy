package BaseDonnee;

import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        	  
    	  String file = "Jeux_de_donnees\\grand\\init-clients-500-200-Carre.csv";
    	  BufferedReader reader = null;
    	  String line = "";
    	  try {
    		   reader = new BufferedReader(new FileReader(file));
    		   while((line = reader.readLine()) != null) {
    		    
    		    String[] row = line.split(",");
    		    for(String obj : row) {
    		     System.out.printf("%-10s", obj);

    		    }
    		    System.out.println();
    		   }
    		  }
    		  catch(Exception e) {
    		   e.printStackTrace();
    		  }
    		  finally {
    		   try {
    		    reader.close();
    		   } catch (IOException e) {
    		    // TODO Auto-generated catch block
    		    e.printStackTrace();
    		   }
    		  }
    		 }
    		}