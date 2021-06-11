package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        for (int i =0; i<args.length;i++){
            int fH = Integer.parseInt(args[i]);//int to string
            float C = fahrenheitEnCelsius(fH);
            System.out.println(fH + "\u00B0F -> " + C + "\u00B0C");
        }
        //int fahrenheit = 0;
        //float celsius = 0;

                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float valueInC  = ((float)f - 32)* 5/9; //Calculate
        valueInC = (float) (Math.round(valueInC* 10)/10.0); // 1 number rounding after the decimal
        return valueInC; 
    }

}
