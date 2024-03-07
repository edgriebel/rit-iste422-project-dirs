import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdgeConnector {

   private static final Logger logger = LoggerFactory.getLogger(EdgeConnector.class);
   private int numConnector, endPoint1, endPoint2;
   private String endStyle1, endStyle2;
   private boolean isEP1Field, isEP2Field, isEP1Table, isEP2Table;
      
   public EdgeConnector(String inputString) {
      StringTokenizer st = new StringTokenizer(inputString, EdgeConvertFileParser.DELIM);
      try {
         try{
            numConnector = Integer.parseInt(st.nextToken());
            endPoint1 = Integer.parseInt(st.nextToken());
            endPoint2 = Integer.parseInt(st.nextToken());
         } catch (IllegalArgumentException ex){
            logger.error("Attempted to parse a non-integer token when creating"+
            EdgeConnector.class +
            ". \nException Caught: "+ex+",\r\nstacktrace: \n"+ex.getStackTrace());
         }
         endStyle1 = st.nextToken();
         endStyle2 = st.nextToken();
      } catch (ArrayIndexOutOfBoundsException e){
         logger.error("Error in "+EdgeConnector.class+" constructor. \nInput contained too few characters. "+
         "\nException Caught: "+e+"\nstacktrace: \n"+e.getStackTrace());
      }
      isEP1Field = false;
      isEP2Field = false;
      isEP1Table = false;
      isEP2Table = false;
   }
   
   public int getNumConnector() {
      return numConnector;
   }
   
   public int getEndPoint1() {
      return endPoint1;
   }
   
   public int getEndPoint2() {
      return endPoint2;
   }
   
   public String getEndStyle1() {
      return endStyle1;
   }
   
   public String getEndStyle2() {
      return endStyle2;
   }
   public boolean getIsEP1Field() {
      return isEP1Field;
   }
   
   public boolean getIsEP2Field() {
      return isEP2Field;
   }

   public boolean getIsEP1Table() {
      return isEP1Table;
   }

   public boolean getIsEP2Table() {
      return isEP2Table;
   }

   public void setIsEP1Field(boolean value) {
      isEP1Field = value;
   }
   
   public void setIsEP2Field(boolean value) {
      isEP2Field = value;
   }

   public void setIsEP1Table(boolean value) {
      isEP1Table = value;
   }

   public void setIsEP2Table(boolean value) {
      isEP2Table = value;
   }
}