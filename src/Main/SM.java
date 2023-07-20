package Main;

import java.util.ArrayList;

import Garments.Garments;
import Garments.Pants;
import Garments.Shirts;
import Garments.Jackets;
import Garments.Shoes;

public class SM {

	
		
		public static ArrayList<Garments> GarmentsArray = new ArrayList();
		
		public static void addGarment(Garments def)
		{
			GarmentsArray.add(def);
		}
		public static String getAllGarments(){
		       StringBuilder sb = new StringBuilder();
		       
		       for(Garments gar : GarmentsArray){
		           sb.append( gar.toString() ).append("\n");
		       }
		       return sb.toString();
		       }
		
		       public static String getPants(){
		    	      StringBuilder sb = new StringBuilder();
		    	        for ( Garments gar : GarmentsArray ){
		    	            if ( gar instanceof Pants )
		    	                sb.append( gar.toString() ).append("\n");
		    	        }
		    	        return sb.toString(); 
		       }
		       public static String getShirts(){
		    	      StringBuilder sb = new StringBuilder();
		    	        for ( Garments gar : GarmentsArray){
		    	            if ( gar instanceof Shirts )
		    	                sb.append( gar.toString() ).append("\n");
		    	        }
		    	        return sb.toString();
		       }
		       
		    	        public static String getShoes(){
				    	      StringBuilder sb = new StringBuilder();
				    	        for ( Garments gar : GarmentsArray){
				    	            if ( gar instanceof Shoes )
				    	                sb.append( gar.toString() ).append("\n");
				    	        }
				    	        return sb.toString(); 
		    	        }
		    	        public static String getJackets(){
				    	      StringBuilder sb = new StringBuilder();
				    	        for ( Garments gar : GarmentsArray){
				    	            if ( gar instanceof Jackets )
				    	                sb.append( gar.toString() ).append("\n");
				    	        }
				    	        return sb.toString(); 
		    	        }

		 public static void addGarment1(Garments g)
		 {
			 GarmentsArray.add(g);
		 }
		    	        
		    	        
		    	        
		    	        
		    	        
}
