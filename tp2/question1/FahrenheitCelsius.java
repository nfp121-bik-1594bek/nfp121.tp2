package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        for (int i =0; i<args.length;i++){
            int fH = Integer.parseInt(args[i]);//int to string
            float C = fahrenheitEnCelsius(fH);
            System.out.println(fH + "\u00B0F -> " + C + "\u00B0C");
        }
        //int fahrenheit = 0;
        //float celsius = 0;

                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float valueInC  = ((float)f - 32)* 5/9; //Calculate
        valueInC = (float) (Math.round(valueInC* 10)/10.0); // 1 number rounding after the decimal
        return valueInC; 
    }

}
