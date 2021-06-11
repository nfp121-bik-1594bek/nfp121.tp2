package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
        for (int i =0; i<args.length;i++){
            int fH = Integer.parseInt(args[i]);
            float C = fahrenheitEnCelsius(fH);
            System.out.println(fH + "\u00B0F -> " + C + "\u00B0C");
        }   
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       float valueInC  = ((float)f - 32)* 5/9;
        valueInC = (float) (Math.round(valueInC* 10)/10.0);
        return valueInC;
     }

}
